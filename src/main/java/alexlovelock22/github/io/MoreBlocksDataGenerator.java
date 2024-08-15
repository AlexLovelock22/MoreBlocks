package alexlovelock22.github.io;

import alexlovelock22.github.io.data.generator.MoreBlocksWorldGenerator;
import alexlovelock22.github.io.data.provider.*;
import alexlovelock22.github.io.init.worldgen.ConfiguredFeatureInit;
import alexlovelock22.github.io.init.worldgen.PlacedFeatureInit;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class MoreBlocksDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(MoreBlocksModelProvider::new);
		pack.addProvider(MoreBlocksEnglishLanguageProvider::new);
		pack.addProvider(MoreBlocksBlockLootTableProvider::new);
		pack.addProvider(MoreBlocksBlockTagProvider::new);
		pack.addProvider(MoreBlocksWorldGenerator::new);
		pack.addProvider(MoreBlocksRecipeProvider::new);
		pack.addProvider(MoreBlocksItemTagProvider::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeatureInit::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, PlacedFeatureInit::bootstrap);
	}
}
