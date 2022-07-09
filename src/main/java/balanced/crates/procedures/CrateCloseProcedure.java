package balanced.crates.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import java.util.Map;

import balanced.crates.block.WarpedCrateBlock;
import balanced.crates.block.SpruceCrateBlock;
import balanced.crates.block.OpenWarpedCrateBlock;
import balanced.crates.block.OpenSpruceCrateBlock;
import balanced.crates.block.OpenOakCrateBlock;
import balanced.crates.block.OpenIndustrialCrateBlock;
import balanced.crates.block.OpenDarkOakCrateBlock;
import balanced.crates.block.OpenCrimsonCrateBlock;
import balanced.crates.block.OpenBirchCrateBlock;
import balanced.crates.block.OpenAcaciaCrateBlock;
import balanced.crates.block.OakCrateBlock;
import balanced.crates.block.JungleCrateOpenBlock;
import balanced.crates.block.JungleCrateBlock;
import balanced.crates.block.IndustrialCrateBlock;
import balanced.crates.block.DarkOakCrateBlock;
import balanced.crates.block.CrimsonCrateBlock;
import balanced.crates.block.BirchCrateBlock;
import balanced.crates.block.AcaciaCrateBlock;
import balanced.crates.BalancedCratesMod;

public class CrateCloseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BalancedCratesMod.LOGGER.warn("Failed to load dependency world for procedure CrateClose!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BalancedCratesMod.LOGGER.warn("Failed to load dependency x for procedure CrateClose!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BalancedCratesMod.LOGGER.warn("Failed to load dependency y for procedure CrateClose!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BalancedCratesMod.LOGGER.warn("Failed to load dependency z for procedure CrateClose!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BalancedCratesMod.LOGGER.warn("Failed to load dependency entity for procedure CrateClose!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenOakCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = OakCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenSpruceCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = SpruceCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenBirchCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = BirchCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == JungleCrateOpenBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = JungleCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenAcaciaCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = AcaciaCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenDarkOakCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = DarkOakCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenCrimsonCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = CrimsonCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenWarpedCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = WarpedCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		} else if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == OpenIndustrialCrateBlock.block) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = IndustrialCrateBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos(x, y, z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.barrel.close")),
						SoundCategory.BLOCKS, (float) 1, (float) 1, false);
			}
		}
	}
}
