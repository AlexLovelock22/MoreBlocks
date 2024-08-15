package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.list.enums.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
    }
}
