package alexlovelock22.github.io;

import alexlovelock22.github.io.init.BlockInit;
import alexlovelock22.github.io.init.BoatInit;
import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

public class MoreBlocksClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		// Block Render Layers
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockInit.EXAMPLE_FLOWER, BlockInit.EXAMPLE_FLOWER_POT, BlockInit.EXAMPLE_DOOR,
				BlockInit.EXAMPLE_SAPLING, BlockInit.EXAMPLE_LEAVES, BlockInit.EXAMPLE_TRAPDOOR);

		// Model Layers
		TerraformBoatClientHelper.registerModelLayers(BoatInit.EXAMPLE_BOAT_ID, false);
	}
}