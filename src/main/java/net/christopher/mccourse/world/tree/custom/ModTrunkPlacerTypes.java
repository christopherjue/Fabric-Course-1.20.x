package net.christopher.mccourse.world.tree.custom;

import net.christopher.mccourse.MCCourseMod;
import net.christopher.mccourse.mixin.TrunkPlacerTypeInvoker;
import net.minecraft.world.gen.trunk.TrunkPlacerType;

public class ModTrunkPlacerTypes {
    public static final TrunkPlacerType<?> DRIFTWOOD_TRUNK_PLACER = TrunkPlacerTypeInvoker.callRegister("driftwood_trunk_placer",
           DriftwoodTrunkPlacer.CODEC );



    public static void register() {
        MCCourseMod.LOGGER.info("Registering Trunk Placer for " + MCCourseMod.MOD_ID);
    }
}
