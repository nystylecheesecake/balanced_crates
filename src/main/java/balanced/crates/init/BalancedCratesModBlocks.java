
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balanced.crates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import balanced.crates.block.WarpedCrateBlock;
import balanced.crates.block.SpruceCrateBlock;
import balanced.crates.block.OpenWarpedCrateBlock;
import balanced.crates.block.OpenSpruceCrateBlock;
import balanced.crates.block.OpenOakCrateBlock;
import balanced.crates.block.OpenLargeWarpedCrateBlock;
import balanced.crates.block.OpenLargeSpruceCrateBlock;
import balanced.crates.block.OpenLargeOakCrateBlock;
import balanced.crates.block.OpenLargeJungleCrateBlock;
import balanced.crates.block.OpenLargeIndustrialCrateBlock;
import balanced.crates.block.OpenLargeDarkOakCrateBlock;
import balanced.crates.block.OpenLargeCrimsonCrateBlock;
import balanced.crates.block.OpenLargeBirchCrateBlock;
import balanced.crates.block.OpenLargeAcaciaCrateBlock;
import balanced.crates.block.OpenIndustrialCrateBlock;
import balanced.crates.block.OpenDarkOakCrateBlock;
import balanced.crates.block.OpenCrimsonCrateBlock;
import balanced.crates.block.OpenBirchCrateBlock;
import balanced.crates.block.OpenAcaciaCrateBlock;
import balanced.crates.block.OakCrateBlock;
import balanced.crates.block.LargeWarpedCrateBlock;
import balanced.crates.block.LargeSpruceCrateBlock;
import balanced.crates.block.LargeOakCrateBlock;
import balanced.crates.block.LargeJungleCrateBlock;
import balanced.crates.block.LargeIndustrialCrateBlock;
import balanced.crates.block.LargeDarkOakCrateBlock;
import balanced.crates.block.LargeCrimsonCrateBlock;
import balanced.crates.block.LargeBirchCrateBlock;
import balanced.crates.block.LargeAcaciaCrateBlock;
import balanced.crates.block.JungleCrateOpenBlock;
import balanced.crates.block.JungleCrateBlock;
import balanced.crates.block.IndustrialCrateBlock;
import balanced.crates.block.DarkOakCrateBlock;
import balanced.crates.block.CrimsonCrateBlock;
import balanced.crates.block.CrateUIBlock;
import balanced.crates.block.BirchCrateBlock;
import balanced.crates.block.AcaciaCrateBlock;
import balanced.crates.BalancedCratesMod;

public class BalancedCratesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BalancedCratesMod.MODID);
	public static final RegistryObject<Block> INDUSTRIAL_CRATE = REGISTRY.register("industrial_crate", () -> new IndustrialCrateBlock());
	public static final RegistryObject<Block> OAK_CRATE = REGISTRY.register("oak_crate", () -> new OakCrateBlock());
	public static final RegistryObject<Block> SPRUCE_CRATE = REGISTRY.register("spruce_crate", () -> new SpruceCrateBlock());
	public static final RegistryObject<Block> BIRCH_CRATE = REGISTRY.register("birch_crate", () -> new BirchCrateBlock());
	public static final RegistryObject<Block> JUNGLE_CRATE = REGISTRY.register("jungle_crate", () -> new JungleCrateBlock());
	public static final RegistryObject<Block> ACACIA_CRATE = REGISTRY.register("acacia_crate", () -> new AcaciaCrateBlock());
	public static final RegistryObject<Block> DARK_OAK_CRATE = REGISTRY.register("dark_oak_crate", () -> new DarkOakCrateBlock());
	public static final RegistryObject<Block> CRIMSON_CRATE = REGISTRY.register("crimson_crate", () -> new CrimsonCrateBlock());
	public static final RegistryObject<Block> WARPED_CRATE = REGISTRY.register("warped_crate", () -> new WarpedCrateBlock());
	public static final RegistryObject<Block> LARGE_INDUSTRIAL_CRATE = REGISTRY.register("large_industrial_crate",
			() -> new LargeIndustrialCrateBlock());
	public static final RegistryObject<Block> LARGE_OAK_CRATE = REGISTRY.register("large_oak_crate", () -> new LargeOakCrateBlock());
	public static final RegistryObject<Block> LARGE_SPRUCE_CRATE = REGISTRY.register("large_spruce_crate", () -> new LargeSpruceCrateBlock());
	public static final RegistryObject<Block> LARGE_BIRCH_CRATE = REGISTRY.register("large_birch_crate", () -> new LargeBirchCrateBlock());
	public static final RegistryObject<Block> LARGE_JUNGLE_CRATE = REGISTRY.register("large_jungle_crate", () -> new LargeJungleCrateBlock());
	public static final RegistryObject<Block> LARGE_ACACIA_CRATE = REGISTRY.register("large_acacia_crate", () -> new LargeAcaciaCrateBlock());
	public static final RegistryObject<Block> LARGE_DARK_OAK_CRATE = REGISTRY.register("large_dark_oak_crate", () -> new LargeDarkOakCrateBlock());
	public static final RegistryObject<Block> LARGE_CRIMSON_CRATE = REGISTRY.register("large_crimson_crate", () -> new LargeCrimsonCrateBlock());
	public static final RegistryObject<Block> LARGE_WARPED_CRATE = REGISTRY.register("large_warped_crate", () -> new LargeWarpedCrateBlock());
	public static final RegistryObject<Block> OPEN_INDUSTRIAL_CRATE = REGISTRY.register("open_industrial_crate",
			() -> new OpenIndustrialCrateBlock());
	public static final RegistryObject<Block> OPEN_OAK_CRATE = REGISTRY.register("open_oak_crate", () -> new OpenOakCrateBlock());
	public static final RegistryObject<Block> OPEN_SPRUCE_CRATE = REGISTRY.register("open_spruce_crate", () -> new OpenSpruceCrateBlock());
	public static final RegistryObject<Block> OPEN_BIRCH_CRATE = REGISTRY.register("open_birch_crate", () -> new OpenBirchCrateBlock());
	public static final RegistryObject<Block> JUNGLE_CRATE_OPEN = REGISTRY.register("jungle_crate_open", () -> new JungleCrateOpenBlock());
	public static final RegistryObject<Block> OPEN_ACACIA_CRATE = REGISTRY.register("open_acacia_crate", () -> new OpenAcaciaCrateBlock());
	public static final RegistryObject<Block> OPEN_DARK_OAK_CRATE = REGISTRY.register("open_dark_oak_crate", () -> new OpenDarkOakCrateBlock());
	public static final RegistryObject<Block> OPEN_CRIMSON_CRATE = REGISTRY.register("open_crimson_crate", () -> new OpenCrimsonCrateBlock());
	public static final RegistryObject<Block> OPEN_WARPED_CRATE = REGISTRY.register("open_warped_crate", () -> new OpenWarpedCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_INDUSTRIAL_CRATE = REGISTRY.register("open_large_industrial_crate",
			() -> new OpenLargeIndustrialCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_OAK_CRATE = REGISTRY.register("open_large_oak_crate", () -> new OpenLargeOakCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_SPRUCE_CRATE = REGISTRY.register("open_large_spruce_crate",
			() -> new OpenLargeSpruceCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_BIRCH_CRATE = REGISTRY.register("open_large_birch_crate",
			() -> new OpenLargeBirchCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_JUNGLE_CRATE = REGISTRY.register("open_large_jungle_crate",
			() -> new OpenLargeJungleCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_ACACIA_CRATE = REGISTRY.register("open_large_acacia_crate",
			() -> new OpenLargeAcaciaCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_DARK_OAK_CRATE = REGISTRY.register("open_large_dark_oak_crate",
			() -> new OpenLargeDarkOakCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_CRIMSON_CRATE = REGISTRY.register("open_large_crimson_crate",
			() -> new OpenLargeCrimsonCrateBlock());
	public static final RegistryObject<Block> OPEN_LARGE_WARPED_CRATE = REGISTRY.register("open_large_warped_crate",
			() -> new OpenLargeWarpedCrateBlock());
	public static final RegistryObject<Block> CRATE_UI = REGISTRY.register("crate_ui", () -> new CrateUIBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			OakCrateBlock.registerRenderLayer();
			LargeIndustrialCrateBlock.registerRenderLayer();
			LargeOakCrateBlock.registerRenderLayer();
			LargeSpruceCrateBlock.registerRenderLayer();
			LargeBirchCrateBlock.registerRenderLayer();
			LargeJungleCrateBlock.registerRenderLayer();
			LargeAcaciaCrateBlock.registerRenderLayer();
			LargeDarkOakCrateBlock.registerRenderLayer();
			LargeCrimsonCrateBlock.registerRenderLayer();
			LargeWarpedCrateBlock.registerRenderLayer();
			OpenIndustrialCrateBlock.registerRenderLayer();
			OpenOakCrateBlock.registerRenderLayer();
			OpenSpruceCrateBlock.registerRenderLayer();
			OpenBirchCrateBlock.registerRenderLayer();
			JungleCrateOpenBlock.registerRenderLayer();
			OpenAcaciaCrateBlock.registerRenderLayer();
			OpenDarkOakCrateBlock.registerRenderLayer();
			OpenCrimsonCrateBlock.registerRenderLayer();
			OpenWarpedCrateBlock.registerRenderLayer();
			OpenLargeIndustrialCrateBlock.registerRenderLayer();
			OpenLargeOakCrateBlock.registerRenderLayer();
			OpenLargeSpruceCrateBlock.registerRenderLayer();
			OpenLargeBirchCrateBlock.registerRenderLayer();
			OpenLargeJungleCrateBlock.registerRenderLayer();
			OpenLargeAcaciaCrateBlock.registerRenderLayer();
			OpenLargeDarkOakCrateBlock.registerRenderLayer();
			OpenLargeCrimsonCrateBlock.registerRenderLayer();
			OpenLargeWarpedCrateBlock.registerRenderLayer();
			CrateUIBlock.registerRenderLayer();
		}
	}
}
