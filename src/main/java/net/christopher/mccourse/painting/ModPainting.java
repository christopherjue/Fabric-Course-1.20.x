package net.christopher.mccourse.painting;

import net.christopher.mccourse.MCCourseMod;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.awt.*;

public class ModPainting {
    public static final PaintingVariant SAW_THEM = registerPainting("saw_them", new PaintingVariant(16, 16));
    public static final PaintingVariant SHRIMP = registerPainting("shrimp", new PaintingVariant(32, 16));
    public static final PaintingVariant WORLD = registerPainting("world", new PaintingVariant(32, 32));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(MCCourseMod.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        MCCourseMod.LOGGER.info("Registering Painting for " + MCCourseMod.MOD_ID);
    }

}
