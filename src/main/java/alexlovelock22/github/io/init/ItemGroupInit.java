package alexlovelock22.github.io.init;

import alexlovelock22.github.io.MoreBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text MORE_BLOCKS_TITLE = Text.translatable("itemGroup." + MoreBlocks.MOD_ID + ".more_blocks");



    public static final ItemGroup MORE_BLOCKS = register("more_blocks", FabricItemGroup.builder()
            .displayName(MORE_BLOCKS_TITLE)
            .icon(ItemInit.STONE_WALL::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(MoreBlocks.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());


    public static <T extends ItemGroup> T register(String name, T itemGroup){
        return Registry.register(Registries.ITEM_GROUP, MoreBlocks.id(name), itemGroup);
    }

    public static void load(){

    }
}


