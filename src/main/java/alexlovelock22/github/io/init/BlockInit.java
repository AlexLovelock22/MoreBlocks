package alexlovelock22.github.io.init;

import alexlovelock22.github.io.MoreBlocks;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;

import javax.swing.*;
import java.util.List;

public class BlockInit {

    //public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new Block(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE)));
    public static final Block SMOOTH_SANDSTONE_WALL = registerWithItem("smooth_sandstone_wall", new Block(AbstractBlock.Settings.create()
            .strength(1.5F, 6.0F)
            .requiresTool()));

    public static final Block EXAMPLE_OVERWORLD_ORE = registerWithItem("example_overworld_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block EXAMPLE_DEEPSLATE_ORE = registerWithItem("example_deepslate_ore", new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 5.0F)
            .requiresTool()));

    public static final Block EXAMPLE_NETHER_ORE = registerWithItem("example_nether_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block EXAMPLE_END_ORE = registerWithItem("example_end_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final FlowerBlock EXAMPLE_FLOWER = registerWithItem("example_flower", new FlowerBlock(
            createStewEffects(
                    new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.SPEED, 444),
                    new SuspiciousStewEffectsComponent.StewEffect(StatusEffects.GLOWING, 444)),

            AbstractBlock.Settings.create()
                    .mapColor(MapColor.BRIGHT_TEAL)
                    .noCollision()
                    .breakInstantly()
                    .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                    .offset(AbstractBlock.OffsetType.XZ)
                    .pistonBehavior(PistonBehavior.DESTROY)
            ));

    public static final Block EXAMPLE_FLOWER_POT = register("example_flower_pot",
            Blocks.createFlowerPotBlock(EXAMPLE_FLOWER));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, MoreBlocks.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static SuspiciousStewEffectsComponent createStewEffects(SuspiciousStewEffectsComponent.StewEffect... effects) {
        return new SuspiciousStewEffectsComponent(List.of(effects));
    }

    public static void load() {}
}
