package net.christopher.mccourse.entity.layer;

import net.christopher.mccourse.MCCourseMod;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModModelLayers {
    public static final EntityModelLayer PORCUPINE =
            new EntityModelLayer(new Identifier(MCCourseMod.MOD_ID, "porcupine"), "main");
}