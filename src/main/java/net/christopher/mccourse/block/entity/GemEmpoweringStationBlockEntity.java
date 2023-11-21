package net.christopher.mccourse.block.entity;

import net.christopher.mccourse.item.ModItems;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventories;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.PropertyDelegate;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class GemEmpoweringStationBlockEntity extends BlockEntity implements ExtendedScreenHandlerFactory, ImplmentedInventory {
    private final DefaultedList<ItemStack> inventory = DefaultedList.ofSize(4, ItemStack.EMPTY);

    public static final int INPUT_SLOT = 0;
    public static final int FLUID_ITEM_SLOT = 1;
    public static final int OUTPUT_SLOT = 2;
    public static final int ENERGY_ITEM_SLOT = 3;

    protected final PropertyDelegate propertyDelegate;
    private int progress = 0;
    private int maxProgress = 72;


    public GemEmpoweringStationBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GEM_EMPOWERING_STATION_BE, pos, state);
        this.propertyDelegate = new PropertyDelegate() {
            @Override
            public int get(int index) {
                return switch (index) {
                    case 0 -> GemEmpoweringStationBlockEntity.this.progress;
                    case 1 -> GemEmpoweringStationBlockEntity.this.maxProgress;
                    default -> 0;
                };
            }

            @Override
            public void set(int index, int value) {
                switch (index) {
                    case 0:
                        GemEmpoweringStationBlockEntity.this.progress = value;
                    case 1:
                        GemEmpoweringStationBlockEntity.this.maxProgress = value;
                }

            }

            @Override
            public int size() {
                return 2;
            }
        };
    }

    @Override
    public void writeScreenOpeningData(ServerPlayerEntity player, PacketByteBuf buf) {
        buf.writeBlockPos(this.pos);

    }

    @Override
    public Text getDisplayName() {
        return Text.literal("Gem Empowering Station");
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory playerInventory, PlayerEntity player) {
        return
    }

    @Override
    public DefaultedList<ItemStack> getItems() {
        return this.inventory;
    }

    @Override
    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, inventory);
        nbt.putInt("gem_empowering_station.progress", progress);
    }


    @Override
    public void readNbt(NbtCompound nbt) {
        Inventories.readNbt(nbt, inventory);
        progress = nbt.getInt("gem_empowering_station.progress");
        super.readNbt(nbt);


    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if (canInsertIntoOutputSlot() && hasRecipe()) {
            increaseCraftingProgress();
            markDirty(world, pos, state);

            if (hasCraftingFinished()) {
                craftItem();
                restProgress();
            }
        }else{
           restProgress();
        }
    }

    private void craftItem() {
        this.removeStack(INPUT_SLOT, 1);
        this.setStack(OUTPUT_SLOT, new ItemStack(this.getStack(OUTPUT_SLOT).getItem(),
                this.getStack(OUTPUT_SLOT).getCount() + 1));
    }

    private void restProgress() {
        this.progress = 0;
    }

    private boolean hasCraftingFinished() {
        return this.progress >= this.maxProgress;
    }

    private void increaseCraftingProgress() {
        this.progress++;
    }

    private boolean hasRecipe() {
        return this.getStack(INPUT_SLOT).getItem() == ModItems.RAW_PINK_GARNET;
    }

    private boolean canInsertIntoOutputSlot() {
        return this.getStack(OUTPUT_SLOT).isEmpty() ||
                this.getStack(OUTPUT_SLOT).getCount() < this.getStack(OUTPUT_SLOT).getMaxCount();

    }
}