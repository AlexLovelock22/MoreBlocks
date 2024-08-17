package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;

public class MoreBlocksModelProvider extends FabricModelProvider {
    public MoreBlocksModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.SMOOTH_SANDSTONE_WALL);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_OVERWORLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_END_ORE);
        blockStateModelGenerator.registerFlowerPotPlant(BlockInit.EXAMPLE_FLOWER, BlockInit.EXAMPLE_FLOWER_POT, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerLog(BlockInit.EXAMPLE_LOG)
                .log(BlockInit.EXAMPLE_LOG)
                .wood(BlockInit.EXAMPLE_WOOD);

        blockStateModelGenerator.registerLog(BlockInit.STRIPPED_EXAMPLE_LOG)
                .log(BlockInit.STRIPPED_EXAMPLE_LOG)
                .wood(BlockInit.STRIPPED_EXAMPLE_WOOD);

        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.EXAMPLE_LEAVES);
        blockStateModelGenerator.registerTintableCross(BlockInit.EXAMPLE_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerHangingSign(BlockInit.STRIPPED_EXAMPLE_LOG, BlockInit.EXAMPLE_HANGING_SIGN, BlockInit.EXAMPLE_WALL_HANGING_SIGN);

        var exampleFamily = new BlockFamily.Builder(BlockInit.EXAMPLE_PLANKS)
                .button(BlockInit.EXAMPLE_BUTTON)
                .fence(BlockInit.EXAMPLE_FENCE)
                .fenceGate(BlockInit.EXAMPLE_FENCE_GATE)
                .pressurePlate(BlockInit.EXAMPLE_PRESSURE_PLATE)
                .sign(BlockInit.EXAMPLE_SIGN, BlockInit.EXAMPLE_WALL_SIGN)
                .slab(BlockInit.EXAMPLE_SLAB)
                .stairs(BlockInit.EXAMPLE_STAIRS)
                .door(BlockInit.EXAMPLE_DOOR)
                .trapdoor(BlockInit.EXAMPLE_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();

        blockStateModelGenerator.registerCubeAllModelTexturePool(exampleFamily.getBaseBlock())
                .family(exampleFamily);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.BANANA, Models.GENERATED);
        itemModelGenerator.register(ItemInit.STONE_WALL, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EXAMPLE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EXAMPLE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EXAMPLE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EXAMPLE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.EXAMPLE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.EXAMPLE_CHEST_BOAT, Models.GENERATED);





    }
}
