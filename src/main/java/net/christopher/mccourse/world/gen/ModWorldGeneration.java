package net.christopher.mccourse.world.gen;

public class ModWorldGeneration {
    public static void generateModWorldGeneration() {
        ModOreGeneration.generateOres();

        ModTreeGeneration.generateTrees();
        ModFlowerGeneration.generateFlowers();

    }
}
