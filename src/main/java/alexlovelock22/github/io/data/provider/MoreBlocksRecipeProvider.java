package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemInit;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

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
    }

    private static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}