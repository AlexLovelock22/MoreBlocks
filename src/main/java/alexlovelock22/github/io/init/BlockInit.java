package alexlovelock22.github.io.init;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.list.BlockSetTypeList;
import alexlovelock22.github.io.list.WoodTypeList;
import com.terraformersmc.terraform.sign.api.TerraformHangingSign;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.loot.function.CopyStateLootFunction;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

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

    public static final Block EXAMPLE_LOG = registerWithItem("example_log",
        Blocks.createLogBlock(MapColor.TERRACOTTA_LIGHT_BLUE, MapColor.BRIGHT_TEAL));

    public static final Block STRIPPED_EXAMPLE_LOG = registerWithItem("stripped_example_log",
            Blocks.createLogBlock(MapColor.TERRACOTTA_LIGHT_BLUE, MapColor.BRIGHT_TEAL));

    public static final Block EXAMPLE_WOOD = register("example_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final Block STRIPPED_EXAMPLE_WOOD = register("stripped_example_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE)
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable()));

    public static final LeavesBlock EXAMPLE_LEAVES = registerWithItem("example_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.WHITE_GRAY)
                    .strength(0.2F)
                    .ticksRandomly()
                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()
                    .allowsSpawning(Blocks::canSpawnOnLeaves)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)
                    .burnable()
                    .pistonBehavior(PistonBehavior.DESTROY)
                    .solidBlock(Blocks::never)));

    public static final SaplingBlock EXAMPLE_SAPLING = registerWithItem("example_sapling",
            new SaplingBlock(
                    null,
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.DARK_AQUA)
                            .ticksRandomly()
                            .strength(0.0F)
                            .sounds(BlockSoundGroup.ANVIL)
                            .noCollision()
                            .nonOpaque()
                            .allowsSpawning(Blocks::canSpawnOnLeaves)
                            .suffocates(Blocks::never)
                            .blockVision(Blocks::never)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)
                            .solidBlock(Blocks::never)));

    public static final Block EXAMPLE_PLANKS = registerWithItem("example_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)
                    .mapColor(MapColor.TERRACOTTA_LIGHT_BLUE)));

    public static final DoorBlock EXAMPLE_DOOR = registerWithItem("example_door",
            new DoorBlock(
                    BlockSetTypeList.EXAMPLE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.BANJO)
                            .strength(3.0F)
                            .nonOpaque()
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final FenceBlock EXAMPLE_FENCE = registerWithItem("example_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .burnable()));

    public static final FenceGateBlock EXAMPLE_FENCE_GATE = registerWithItem("example_fence_gate",
            new FenceGateBlock(WoodTypeList.EXAMPLE,
                    AbstractBlock.Settings.create()
                    .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .burnable()));

    public static final StairsBlock EXAMPLE_STAIRS = registerWithItem("example_stairs",
        new StairsBlock(EXAMPLE_PLANKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)
                .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())));

    public static final SlabBlock EXAMPLE_SLAB = registerWithItem("example_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.DEEPSLATE)
                    .burnable()));

    public static final PressurePlateBlock EXAMPLE_PRESSURE_PLATE = registerWithItem("example_pressure_plate",
            new PressurePlateBlock( BlockSetTypeList.EXAMPLE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .noCollision()
                            .strength(0.5F)
                            .burnable()
                            .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block EXAMPLE_BUTTON = registerWithItem("example_button",
            Blocks.createWoodenButtonBlock( BlockSetTypeList.EXAMPLE));

    public static final TrapdoorBlock EXAMPLE_TRAPDOOR = registerWithItem("example_trapdoor",
            new TrapdoorBlock( BlockSetTypeList.EXAMPLE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .instrument(NoteBlockInstrument.DIDGERIDOO)
                            .strength(3.0F)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .burnable()));


    public static final Identifier EXAMPLE_SIGN_TEXTURE = MoreBlocks.id("entity/signs/example");
    public static final Identifier EXAMPLE_HANGING_SIGN_TEXTURE = MoreBlocks.id("entity/signs/hanging/example");
    public static final Identifier EXAMPLE_HANGING_SIGN_GUI_TEXTURE = MoreBlocks.id("textures/gui/hanging_signs/example");



    public static final TerraformSignBlock EXAMPLE_SIGN = register("example_sign",
            new TerraformSignBlock(EXAMPLE_SIGN_TEXTURE,
                 AbstractBlock.Settings.create()
                         .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                         .solid()
                         .instrument(NoteBlockInstrument.DIDGERIDOO)
                         .noCollision()
                         .strength(1.0F)
                         .burnable()));

    public static final TerraformWallSignBlock EXAMPLE_WALL_SIGN = register("example_wall_sign",
            new TerraformWallSignBlock(EXAMPLE_SIGN_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.DIDGERIDOO)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformHangingSignBlock EXAMPLE_HANGING_SIGN = register("example_hanging_sign",
            new TerraformHangingSignBlock(EXAMPLE_HANGING_SIGN_TEXTURE, EXAMPLE_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.DIDGERIDOO)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));

    public static final TerraformWallHangingSignBlock EXAMPLE_WALL_HANGING_SIGN = register("example_wall_hanging_sign",
            new TerraformWallHangingSignBlock(EXAMPLE_HANGING_SIGN_TEXTURE, EXAMPLE_HANGING_SIGN_GUI_TEXTURE,
                    AbstractBlock.Settings.create()
                            .mapColor(EXAMPLE_PLANKS.getDefaultMapColor())
                            .solid()
                            .instrument(NoteBlockInstrument.DIDGERIDOO)
                            .noCollision()
                            .strength(1.0F)
                            .burnable()));



    public static final WallBlock WALL_SANDSTONE_SMOOTH = registerWithItem("wall_sandstone_smooth",
            new WallBlock(AbstractBlock.Settings.create()
                    .mapColor(MapColor.GOLD)
                    .solid()
                    .instrument(NoteBlockInstrument.BANJO)
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.STONE)
                    .burnable()));


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
