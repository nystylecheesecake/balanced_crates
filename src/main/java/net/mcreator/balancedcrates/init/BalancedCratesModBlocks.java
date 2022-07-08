
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balancedcrates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.balancedcrates.block.WarpedCrateBlock;
import net.mcreator.balancedcrates.block.SpruceCrateBlock;
import net.mcreator.balancedcrates.block.OpenWarpedCrateBlock;
import net.mcreator.balancedcrates.block.OpenSpruceCrateBlock;
import net.mcreator.balancedcrates.block.OpenOakCrateBlock;
import net.mcreator.balancedcrates.block.OpenIndustrialCrateBlock;
import net.mcreator.balancedcrates.block.OpenDarkOakCrateBlock;
import net.mcreator.balancedcrates.block.OpenCrimsonCrateBlock;
import net.mcreator.balancedcrates.block.OpenBirchCrateBlock;
import net.mcreator.balancedcrates.block.OpenAcaciaCrateBlock;
import net.mcreator.balancedcrates.block.OakCrateBlock;
import net.mcreator.balancedcrates.block.JungleCrateOpenBlock;
import net.mcreator.balancedcrates.block.JungleCrateBlock;
import net.mcreator.balancedcrates.block.IndustrialCrateBlock;
import net.mcreator.balancedcrates.block.DarkOakCrateBlock;
import net.mcreator.balancedcrates.block.CrimsonCrateBlock;
import net.mcreator.balancedcrates.block.CrateUIBlock;
import net.mcreator.balancedcrates.block.BirchCrateBlock;
import net.mcreator.balancedcrates.block.AcaciaCrateBlock;
import net.mcreator.balancedcrates.BalancedCratesMod;

public class BalancedCratesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalancedCratesMod.MODID);
	public static final RegistryObject<Block> OAK_CRATE = REGISTRY.register("oak_crate", () -> new OakCrateBlock());
	public static final RegistryObject<Block> SPRUCE_CRATE = REGISTRY.register("spruce_crate", () -> new SpruceCrateBlock());
	public static final RegistryObject<Block> BIRCH_CRATE = REGISTRY.register("birch_crate", () -> new BirchCrateBlock());
	public static final RegistryObject<Block> JUNGLE_CRATE = REGISTRY.register("jungle_crate", () -> new JungleCrateBlock());
	public static final RegistryObject<Block> ACACIA_CRATE = REGISTRY.register("acacia_crate", () -> new AcaciaCrateBlock());
	public static final RegistryObject<Block> DARK_OAK_CRATE = REGISTRY.register("dark_oak_crate", () -> new DarkOakCrateBlock());
	public static final RegistryObject<Block> CRIMSON_CRATE = REGISTRY.register("crimson_crate", () -> new CrimsonCrateBlock());
	public static final RegistryObject<Block> WARPED_CRATE = REGISTRY.register("warped_crate", () -> new WarpedCrateBlock());
	public static final RegistryObject<Block> INDUSTRIAL_CRATE = REGISTRY.register("industrial_crate", () -> new IndustrialCrateBlock());
	public static final RegistryObject<Block> OPEN_OAK_CRATE = REGISTRY.register("open_oak_crate", () -> new OpenOakCrateBlock());
	public static final RegistryObject<Block> OPEN_SPRUCE_CRATE = REGISTRY.register("open_spruce_crate", () -> new OpenSpruceCrateBlock());
	public static final RegistryObject<Block> OPEN_BIRCH_CRATE = REGISTRY.register("open_birch_crate", () -> new OpenBirchCrateBlock());
	public static final RegistryObject<Block> JUNGLE_CRATE_OPEN = REGISTRY.register("jungle_crate_open", () -> new JungleCrateOpenBlock());
	public static final RegistryObject<Block> OPEN_ACACIA_CRATE = REGISTRY.register("open_acacia_crate", () -> new OpenAcaciaCrateBlock());
	public static final RegistryObject<Block> OPEN_DARK_OAK_CRATE = REGISTRY.register("open_dark_oak_crate", () -> new OpenDarkOakCrateBlock());
	public static final RegistryObject<Block> OPEN_CRIMSON_CRATE = REGISTRY.register("open_crimson_crate", () -> new OpenCrimsonCrateBlock());
	public static final RegistryObject<Block> OPEN_WARPED_CRATE = REGISTRY.register("open_warped_crate", () -> new OpenWarpedCrateBlock());
	public static final RegistryObject<Block> OPEN_INDUSTRIAL_CRATE = REGISTRY.register("open_industrial_crate",
			() -> new OpenIndustrialCrateBlock());
	public static final RegistryObject<Block> CRATE_UI = REGISTRY.register("crate_ui", () -> new CrateUIBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OakCrateBlock.registerRenderLayer();
			OpenOakCrateBlock.registerRenderLayer();
			OpenSpruceCrateBlock.registerRenderLayer();
			OpenBirchCrateBlock.registerRenderLayer();
			JungleCrateOpenBlock.registerRenderLayer();
			OpenAcaciaCrateBlock.registerRenderLayer();
			OpenDarkOakCrateBlock.registerRenderLayer();
			OpenCrimsonCrateBlock.registerRenderLayer();
			OpenWarpedCrateBlock.registerRenderLayer();
			OpenIndustrialCrateBlock.registerRenderLayer();
			CrateUIBlock.registerRenderLayer();
		}
	}
}
