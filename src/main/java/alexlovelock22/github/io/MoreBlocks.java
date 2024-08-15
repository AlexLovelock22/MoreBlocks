package alexlovelock22.github.io;

import alexlovelock22.github.io.init.ArmorMaterialInit;
import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.ItemGroupInit;
import alexlovelock22.github.io.init.ItemInit;
import alexlovelock22.github.io.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreBlocks implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("MoreBlocks");
	public static final String MOD_ID = "moreblocks";


	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");

		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomeModificationInit.load();
		ArmorMaterialInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.PUMPKIN_PIE, ItemInit.BANANA);
		});
	}

	public static Identifier id(String path){
		return Identifier.of(MOD_ID, path);
	}
}