package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.WeatherCheckLootCondition;
import net.minecraft.loot.context.LootContextType;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.EnchantRandomlyLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.server.command.WeatherCommand;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class MoreBlocksBlockLootTableProvider extends FabricBlockLootTableProvider {


    public  MoreBlocksBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.SMOOTH_SANDSTONE_WALL);
        addDrop(BlockInit.EXAMPLE_OVERWORLD_ORE);
        addDrop(BlockInit.EXAMPLE_DEEPSLATE_ORE);
        addDrop(BlockInit.EXAMPLE_NETHER_ORE);
        addDrop(BlockInit.EXAMPLE_END_ORE);
        addDrop(BlockInit.EXAMPLE_FLOWER);
        addPottedPlantDrops(BlockInit.EXAMPLE_FLOWER_POT);

        // Wood set
        addDrop(BlockInit.EXAMPLE_LOG);
        addDrop(BlockInit.STRIPPED_EXAMPLE_LOG);
        addDrop(BlockInit.EXAMPLE_WOOD);
        addDrop(BlockInit.STRIPPED_EXAMPLE_WOOD);
        leavesDrops(BlockInit.EXAMPLE_LEAVES, BlockInit.EXAMPLE_SAPLING, SAPLING_DROP_CHANCE);
        addDrop(BlockInit.EXAMPLE_SAPLING);
        addDrop(BlockInit.EXAMPLE_PLANKS);
        addDrop(BlockInit.EXAMPLE_SLAB);
        addDrop(BlockInit.EXAMPLE_STAIRS);
        addDrop(BlockInit.EXAMPLE_FENCE);
        addDrop(BlockInit.EXAMPLE_FENCE_GATE);
        addDrop(BlockInit.EXAMPLE_DOOR);
        addDrop(BlockInit.EXAMPLE_TRAPDOOR);
        addDrop(BlockInit.EXAMPLE_BUTTON);
        addDrop(BlockInit.EXAMPLE_PRESSURE_PLATE);
        addDrop(BlockInit.EXAMPLE_SIGN, ItemInit.EXAMPLE_SIGN);
        addDrop(BlockInit.EXAMPLE_WALL_SIGN, ItemInit.EXAMPLE_SIGN);
        addDrop(BlockInit.EXAMPLE_HANGING_SIGN, ItemInit.EXAMPLE_HANGING_SIGN);
        addDrop(BlockInit.EXAMPLE_WALL_HANGING_SIGN, ItemInit.EXAMPLE_HANGING_SIGN);

    }
}
