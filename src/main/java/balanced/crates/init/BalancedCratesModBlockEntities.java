
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balanced.crates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import balanced.crates.block.entity.WarpedCrateBlockEntity;
import balanced.crates.block.entity.SpruceCrateBlockEntity;
import balanced.crates.block.entity.OpenWarpedCrateBlockEntity;
import balanced.crates.block.entity.OpenSpruceCrateBlockEntity;
import balanced.crates.block.entity.OpenOakCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeWarpedCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeSpruceCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeOakCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeJungleCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeIndustrialCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeDarkOakCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeCrimsonCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeBirchCrateBlockEntity;
import balanced.crates.block.entity.OpenLargeAcaciaCrateBlockEntity;
import balanced.crates.block.entity.OpenIndustrialCrateBlockEntity;
import balanced.crates.block.entity.OpenDarkOakCrateBlockEntity;
import balanced.crates.block.entity.OpenCrimsonCrateBlockEntity;
import balanced.crates.block.entity.OpenBirchCrateBlockEntity;
import balanced.crates.block.entity.OpenAcaciaCrateBlockEntity;
import balanced.crates.block.entity.OakCrateBlockEntity;
import balanced.crates.block.entity.LargeWarpedCrateBlockEntity;
import balanced.crates.block.entity.LargeSpruceCrateBlockEntity;
import balanced.crates.block.entity.LargeOakCrateBlockEntity;
import balanced.crates.block.entity.LargeJungleCrateBlockEntity;
import balanced.crates.block.entity.LargeIndustrialCrateBlockEntity;
import balanced.crates.block.entity.LargeDarkOakCrateBlockEntity;
import balanced.crates.block.entity.LargeCrimsonCrateBlockEntity;
import balanced.crates.block.entity.LargeBirchCrateBlockEntity;
import balanced.crates.block.entity.LargeAcaciaCrateBlockEntity;
import balanced.crates.block.entity.JungleCrateOpenBlockEntity;
import balanced.crates.block.entity.JungleCrateBlockEntity;
import balanced.crates.block.entity.IndustrialCrateBlockEntity;
import balanced.crates.block.entity.DarkOakCrateBlockEntity;
import balanced.crates.block.entity.CrimsonCrateBlockEntity;
import balanced.crates.block.entity.BirchCrateBlockEntity;
import balanced.crates.block.entity.AcaciaCrateBlockEntity;
import balanced.crates.BalancedCratesMod;

public class BalancedCratesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			BalancedCratesMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> INDUSTRIAL_CRATE = register("industrial_crate", BalancedCratesModBlocks.INDUSTRIAL_CRATE,
			IndustrialCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OAK_CRATE = register("oak_crate", BalancedCratesModBlocks.OAK_CRATE,
			OakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SPRUCE_CRATE = register("spruce_crate", BalancedCratesModBlocks.SPRUCE_CRATE,
			SpruceCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BIRCH_CRATE = register("birch_crate", BalancedCratesModBlocks.BIRCH_CRATE,
			BirchCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLE_CRATE = register("jungle_crate", BalancedCratesModBlocks.JUNGLE_CRATE,
			JungleCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ACACIA_CRATE = register("acacia_crate", BalancedCratesModBlocks.ACACIA_CRATE,
			AcaciaCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DARK_OAK_CRATE = register("dark_oak_crate", BalancedCratesModBlocks.DARK_OAK_CRATE,
			DarkOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CRIMSON_CRATE = register("crimson_crate", BalancedCratesModBlocks.CRIMSON_CRATE,
			CrimsonCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WARPED_CRATE = register("warped_crate", BalancedCratesModBlocks.WARPED_CRATE,
			WarpedCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_INDUSTRIAL_CRATE = register("large_industrial_crate",
			BalancedCratesModBlocks.LARGE_INDUSTRIAL_CRATE, LargeIndustrialCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_OAK_CRATE = register("large_oak_crate", BalancedCratesModBlocks.LARGE_OAK_CRATE,
			LargeOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_SPRUCE_CRATE = register("large_spruce_crate",
			BalancedCratesModBlocks.LARGE_SPRUCE_CRATE, LargeSpruceCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_BIRCH_CRATE = register("large_birch_crate",
			BalancedCratesModBlocks.LARGE_BIRCH_CRATE, LargeBirchCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_JUNGLE_CRATE = register("large_jungle_crate",
			BalancedCratesModBlocks.LARGE_JUNGLE_CRATE, LargeJungleCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_ACACIA_CRATE = register("large_acacia_crate",
			BalancedCratesModBlocks.LARGE_ACACIA_CRATE, LargeAcaciaCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_DARK_OAK_CRATE = register("large_dark_oak_crate",
			BalancedCratesModBlocks.LARGE_DARK_OAK_CRATE, LargeDarkOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_CRIMSON_CRATE = register("large_crimson_crate",
			BalancedCratesModBlocks.LARGE_CRIMSON_CRATE, LargeCrimsonCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LARGE_WARPED_CRATE = register("large_warped_crate",
			BalancedCratesModBlocks.LARGE_WARPED_CRATE, LargeWarpedCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_INDUSTRIAL_CRATE = register("open_industrial_crate",
			BalancedCratesModBlocks.OPEN_INDUSTRIAL_CRATE, OpenIndustrialCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_OAK_CRATE = register("open_oak_crate", BalancedCratesModBlocks.OPEN_OAK_CRATE,
			OpenOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_SPRUCE_CRATE = register("open_spruce_crate",
			BalancedCratesModBlocks.OPEN_SPRUCE_CRATE, OpenSpruceCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_BIRCH_CRATE = register("open_birch_crate", BalancedCratesModBlocks.OPEN_BIRCH_CRATE,
			OpenBirchCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> JUNGLE_CRATE_OPEN = register("jungle_crate_open",
			BalancedCratesModBlocks.JUNGLE_CRATE_OPEN, JungleCrateOpenBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_ACACIA_CRATE = register("open_acacia_crate",
			BalancedCratesModBlocks.OPEN_ACACIA_CRATE, OpenAcaciaCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_DARK_OAK_CRATE = register("open_dark_oak_crate",
			BalancedCratesModBlocks.OPEN_DARK_OAK_CRATE, OpenDarkOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_CRIMSON_CRATE = register("open_crimson_crate",
			BalancedCratesModBlocks.OPEN_CRIMSON_CRATE, OpenCrimsonCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_WARPED_CRATE = register("open_warped_crate",
			BalancedCratesModBlocks.OPEN_WARPED_CRATE, OpenWarpedCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_INDUSTRIAL_CRATE = register("open_large_industrial_crate",
			BalancedCratesModBlocks.OPEN_LARGE_INDUSTRIAL_CRATE, OpenLargeIndustrialCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_OAK_CRATE = register("open_large_oak_crate",
			BalancedCratesModBlocks.OPEN_LARGE_OAK_CRATE, OpenLargeOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_SPRUCE_CRATE = register("open_large_spruce_crate",
			BalancedCratesModBlocks.OPEN_LARGE_SPRUCE_CRATE, OpenLargeSpruceCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_BIRCH_CRATE = register("open_large_birch_crate",
			BalancedCratesModBlocks.OPEN_LARGE_BIRCH_CRATE, OpenLargeBirchCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_JUNGLE_CRATE = register("open_large_jungle_crate",
			BalancedCratesModBlocks.OPEN_LARGE_JUNGLE_CRATE, OpenLargeJungleCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_ACACIA_CRATE = register("open_large_acacia_crate",
			BalancedCratesModBlocks.OPEN_LARGE_ACACIA_CRATE, OpenLargeAcaciaCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_DARK_OAK_CRATE = register("open_large_dark_oak_crate",
			BalancedCratesModBlocks.OPEN_LARGE_DARK_OAK_CRATE, OpenLargeDarkOakCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_CRIMSON_CRATE = register("open_large_crimson_crate",
			BalancedCratesModBlocks.OPEN_LARGE_CRIMSON_CRATE, OpenLargeCrimsonCrateBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OPEN_LARGE_WARPED_CRATE = register("open_large_warped_crate",
			BalancedCratesModBlocks.OPEN_LARGE_WARPED_CRATE, OpenLargeWarpedCrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
