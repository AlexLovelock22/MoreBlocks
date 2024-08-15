package alexlovelock22.github.io.data.provider;

import alexlovelock22.github.io.MoreBlocks;
import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
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
    }
}
