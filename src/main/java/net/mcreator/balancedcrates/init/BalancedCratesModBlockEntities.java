
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balancedcrates.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.balancedcrates.block.entity.WarpedCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.SpruceCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenWarpedCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenSpruceCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenOakCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenIndustrialCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenDarkOakCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenCrimsonCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenBirchCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OpenAcaciaCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.OakCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.JungleCrateOpenBlockEntity;
import net.mcreator.balancedcrates.block.entity.JungleCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.IndustrialCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.DarkOakCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.CrimsonCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.BirchCrateBlockEntity;
import net.mcreator.balancedcrates.block.entity.AcaciaCrateBlockEntity;
import net.mcreator.balancedcrates.BalancedCratesMod;

public class BalancedCratesModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			BalancedCratesMod.MODID);
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
	public static final RegistryObject<BlockEntityType<?>> INDUSTRIAL_CRATE = register("industrial_crate", BalancedCratesModBlocks.INDUSTRIAL_CRATE,
			IndustrialCrateBlockEntity::new);
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
	public static final RegistryObject<BlockEntityType<?>> OPEN_INDUSTRIAL_CRATE = register("open_industrial_crate",
			BalancedCratesModBlocks.OPEN_INDUSTRIAL_CRATE, OpenIndustrialCrateBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
