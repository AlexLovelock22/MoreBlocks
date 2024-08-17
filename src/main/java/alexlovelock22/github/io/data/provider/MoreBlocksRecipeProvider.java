package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemInit;

import alexlovelock22.github.io.list.enums.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import net.minecraft.resource.featuretoggle.FeatureSet;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class MoreBlocksRecipeProvider extends FabricRecipeProvider {
    public MoreBlocksRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_DEEPSLATE_ORE)
                .input('E', ItemInit.BANANA)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.BANANA, 5)
                .input(BlockInit.EXAMPLE_DEEPSLATE_ORE)
                .criterion(hasItem(BlockInit.EXAMPLE_DEEPSLATE_ORE), conditionsFromItem(BlockInit.EXAMPLE_DEEPSLATE_ORE))
                .offerTo(exporter);

        List<ItemConvertible> exampleOres = List.of(BlockInit.EXAMPLE_OVERWORLD_ORE, BlockInit.EXAMPLE_DEEPSLATE_ORE, BlockInit.EXAMPLE_NETHER_ORE, BlockInit.EXAMPLE_END_ORE);

        RecipeProvider.offerBlasting(exporter,
                exampleOres,
                RecipeCategory.MISC,
                ItemInit.BANANA,
                0.2f,
                100,
                "example");

        RecipeProvider.offerSmelting(exporter,
                exampleOres,
                RecipeCategory.MISC,
                ItemInit.BANANA,
                0.2f,
                200,
                "example");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.EXAMPLE_SWORD)
                .input('E', ItemInit.BANANA)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.EXAMPLE_HELMET)
                .input('E', ItemInit.BANANA)
                .pattern("EEE")
                .pattern("E E")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.EXAMPLE_CHESTPLATE)
                .input('E', ItemInit.BANANA)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.EXAMPLE_LEGGINGS)
                .input('E', ItemInit.BANANA)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.EXAMPLE_BOOTS)
                .input('E', ItemInit.BANANA)
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.BANANA), conditionsFromItem(ItemInit.BANANA))
                .offerTo(exporter);


        // Wood set
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_PLANKS, 4)
                .input(Ingredient.fromTag(TagList.Items.EXAMPLE_LOGS))
                .criterion(hasTag(TagList.Items.EXAMPLE_LOGS), conditionsFromTag(TagList.Items.EXAMPLE_LOGS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_SLAB, 6)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_STAIRS, 4)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("T  ")
                .pattern("TT ")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_FENCE, 3)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("TST")
                .pattern("TST")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_FENCE_GATE)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("STT")
                .pattern("STT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_DOOR, 3)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("TT")
                .pattern("TT")
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.EXAMPLE_TRAPDOOR, 2)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("TT")
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlockInit.EXAMPLE_BUTTON)
                .input(BlockInit.EXAMPLE_PLANKS)
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, BlockInit.EXAMPLE_PRESSURE_PLATE)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("TT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ItemInit.EXAMPLE_SIGN, 3)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .input('S', ConventionalItemTags.WOODEN_RODS)
                .pattern("TTT")
                .pattern("TTT")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.WOODEN_RODS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_RODS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ItemInit.EXAMPLE_HANGING_SIGN, 6)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .input('C', ConventionalItemTags.CHAINS)
                .pattern("C C")
                .pattern("TTT")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .criterion(hasTag(ConventionalItemTags.CHAINS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.CHAINS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ItemInit.EXAMPLE_BOAT)
                .input('T', BlockInit.EXAMPLE_PLANKS)
                .pattern("T T")
                .pattern("TTT")
                .criterion(FabricRecipeProvider.hasItem(BlockInit.EXAMPLE_PLANKS), FabricRecipeProvider.conditionsFromItem(BlockInit.EXAMPLE_PLANKS))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.WALL_SANDSTONE_SMOOTH)
                .input('S', Blocks.SMOOTH_SANDSTONE)
                .pattern("SSS")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(Blocks.SMOOTH_SANDSTONE), FabricRecipeProvider.conditionsFromItem(Blocks.SMOOTH_SANDSTONE))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.WALL_STONE)
                .input('S', Blocks.STONE)
                .pattern("SSS")
                .pattern("SSS")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE), FabricRecipeProvider.conditionsFromItem(Blocks.STONE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, ItemInit.EXAMPLE_CHEST_BOAT)
                .input(ItemInit.EXAMPLE_BOAT)
                .input(ConventionalItemTags.WOODEN_CHESTS)
                .criterion(FabricRecipeProvider.hasItem(ItemInit.EXAMPLE_BOAT), FabricRecipeProvider.conditionsFromItem(ItemInit.EXAMPLE_BOAT))
                .criterion(hasTag(ConventionalItemTags.WOODEN_CHESTS), FabricRecipeProvider.conditionsFromTag(ConventionalItemTags.WOODEN_CHESTS))
                .offerTo(exporter);

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

        generateFamily(exporter, exampleFamily, FeatureSet.empty());

    }

    private static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}