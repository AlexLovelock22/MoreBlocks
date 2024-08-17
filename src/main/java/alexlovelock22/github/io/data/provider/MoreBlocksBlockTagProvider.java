package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.list.BlockSetTypeList;
import alexlovelock22.github.io.list.enums.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;

import java.util.concurrent.CompletableFuture;

public class MoreBlocksBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public MoreBlocksBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }



    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)

                .add(BlockInit.EXAMPLE_OVERWORLD_ORE)
                .add(BlockInit.EXAMPLE_DEEPSLATE_ORE)
                .add(BlockInit.EXAMPLE_NETHER_ORE)
                .add(BlockInit.EXAMPLE_END_ORE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

                .add(BlockInit.EXAMPLE_OVERWORLD_ORE)
                .add(BlockInit.EXAMPLE_DEEPSLATE_ORE)
                .add(BlockInit.EXAMPLE_NETHER_ORE)
                .add(BlockInit.EXAMPLE_END_ORE);

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_EXAMPLE_TOOL);

        getOrCreateTagBuilder(TagList.Blocks.EXAMPLE_TAG)
                .add(Blocks.BLUE_ORCHID);

        getOrCreateTagBuilder(BlockTags.SMALL_FLOWERS)
                .add(BlockInit.EXAMPLE_FLOWER);

        getOrCreateTagBuilder(BlockTags.FLOWER_POTS)
                .add(BlockInit.EXAMPLE_FLOWER_POT);

        getOrCreateTagBuilder(TagList.Blocks.EXAMPLE_LOGS)
                .add(BlockInit.EXAMPLE_LOG)
                .add(BlockInit.STRIPPED_EXAMPLE_LOG)
                .add(BlockInit.EXAMPLE_WOOD)
                .add(BlockInit.STRIPPED_EXAMPLE_WOOD);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .addTag(TagList.Blocks.EXAMPLE_LOGS);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(BlockInit.EXAMPLE_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(BlockInit.EXAMPLE_SAPLING);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(BlockInit.EXAMPLE_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(BlockInit.EXAMPLE_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(BlockInit.EXAMPLE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(BlockInit.EXAMPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(BlockInit.EXAMPLE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(BlockInit.EXAMPLE_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(BlockInit.EXAMPLE_STAIRS);

        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(BlockInit.EXAMPLE_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(BlockInit.EXAMPLE_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(BlockInit.EXAMPLE_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(BlockInit.EXAMPLE_WALL_HANGING_SIGN);


        // Sandstone
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlockInit.WALL_SANDSTONE_SMOOTH)
                .add(BlockInit.WALL_SANDSTONE_SMOOTH_RED);

//        getOrCreateTagBuilder(BlockTags.WALLS)
//                .add(BlockInit.WALL_SANDSTONE_SMOOTH_RED);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BlockInit.STAIRS_SANDSTONE_CUT)
                .add(BlockInit.STAIRS_SANDSTONE_CUT_RED);

        // Deepslate
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlockInit.WALL_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(BlockInit.SLAB_DEEPSLATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(BlockInit.STAIRS_DEEPSLATE);



        // Other
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlockInit.WALL_STONE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(BlockInit.WALL_PURPUR);

    }
}
