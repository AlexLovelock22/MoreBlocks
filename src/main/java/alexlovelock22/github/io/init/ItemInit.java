package alexlovelock22.github.io.init;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.list.FoodList;
import alexlovelock22.github.io.list.enums.MoreBlocksToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {

    public static final Item STONE_WALL = register("stone_wall", new Item(new Item.Settings()));
    public static final Item BANANA = register("banana", new Item(new Item.Settings().food(FoodList.BANANA_COMPONENT).maxCount(5)));
    //public static final BlockItem SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new BlockItem(BlockInit.SMOOTH_SANDSTONE_WALL, new Item.Settings()));

    public static final SwordItem EXAMPLE_SWORD = register("example_sword",
            new SwordItem(MoreBlocksToolMaterials.EXAMPLE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MoreBlocksToolMaterials.EXAMPLE, 3, -1))));

    public static final PickaxeItem EXAMPLE_PICKAXE = register("example_pickaxe",
            new PickaxeItem(MoreBlocksToolMaterials.EXAMPLE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MoreBlocksToolMaterials.EXAMPLE, 3, -1))));

    public static final ShovelItem EXAMPLE_SHOVEL = register("example_shovel",
            new ShovelItem(MoreBlocksToolMaterials.EXAMPLE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MoreBlocksToolMaterials.EXAMPLE, 3, -1))));

    public static final AxeItem EXAMPLE_AXE = register("example_axe",
            new AxeItem(MoreBlocksToolMaterials.EXAMPLE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MoreBlocksToolMaterials.EXAMPLE, 3, -1))));

    public static final HoeItem EXAMPLE_HOE= register("example_hoe",
            new HoeItem(MoreBlocksToolMaterials.EXAMPLE, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(MoreBlocksToolMaterials.EXAMPLE, 3, -1))));

    public static final  ArmorItem EXAMPLE_HELMET = register("example_helmet",
            new ArmorItem(ArmorMaterialInit.EXAMPLE, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))
            ));

    public static final  ArmorItem EXAMPLE_LEGGINGS = register("example_leggings",
            new ArmorItem(ArmorMaterialInit.EXAMPLE, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))
            ));

    public static final  ArmorItem EXAMPLE_CHESTPLATE = register("example_chestplate",
            new ArmorItem(ArmorMaterialInit.EXAMPLE, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))
            ));

    public static final  ArmorItem EXAMPLE_BOOTS = register("example_boots",
            new ArmorItem(ArmorMaterialInit.EXAMPLE, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))
    ));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, MoreBlocks.id(name), item);
    }

    public static void load() {}
}
