package alexlovelock22.github.io.list.enums;

import alexlovelock22.github.io.MoreBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_EXAMPLE_TOOL = TagKey.of(RegistryKeys.BLOCK, MoreBlocks.id("incorrect_for_example_tool"));
        public static final TagKey<Block> EXAMPLE_TAG = TagKey.of(RegistryKeys.BLOCK, MoreBlocks.id("example"));

        public static final TagKey<Block> EXAMPLE_LOGS = TagKey.of(RegistryKeys.BLOCK, MoreBlocks.id("example_logs"));
    }

    public static class Items {
        public static final TagKey<Item> EXAMPLE_LOGS = TagKey.of(RegistryKeys.ITEM, MoreBlocks.id("example_logs"));

    }
}
