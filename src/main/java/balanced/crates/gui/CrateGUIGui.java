
package balanced.crates.gui;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.network.IContainerFactory;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.ScreenManager;

import java.util.stream.Stream;
import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import balanced.crates.procedures.CrateCloseProcedure;
import balanced.crates.BalancedCratesModElements;
import balanced.crates.BalancedCratesMod;

@BalancedCratesModElements.ModElement.Tag
public class CrateGUIGui extends BalancedCratesModElements.ModElement {
	public static HashMap guistate = new HashMap();
	private static ContainerType<GuiContainerMod> containerType = null;

	public CrateGUIGui(BalancedCratesModElements instance) {
		super(instance, 23);
		elements.addNetworkMessage(ButtonPressedMessage.class, ButtonPressedMessage::buffer, ButtonPressedMessage::new,
				ButtonPressedMessage::handler);
		elements.addNetworkMessage(GUISlotChangedMessage.class, GUISlotChangedMessage::buffer, GUISlotChangedMessage::new,
				GUISlotChangedMessage::handler);
		containerType = new ContainerType<>(new GuiContainerModFactory());
		FMLJavaModLoadingContext.get().getModEventBus().register(new ContainerRegisterHandler());
	}

	private static class ContainerRegisterHandler {
		@SubscribeEvent
		public void registerContainer(RegistryEvent.Register<ContainerType<?>> event) {
			event.getRegistry().register(containerType.setRegistryName("crate_gui"));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public void initElements() {
		DeferredWorkQueue.runLater(() -> ScreenManager.registerFactory(containerType, CrateGUIGuiWindow::new));
	}

	public static class GuiContainerModFactory implements IContainerFactory {
		public GuiContainerMod create(int id, PlayerInventory inv, PacketBuffer extraData) {
			return new GuiContainerMod(id, inv, extraData);
		}
	}

	public static class GuiContainerMod extends Container implements Supplier<Map<Integer, Slot>> {
		World world;
		PlayerEntity entity;
		int x, y, z;
		private IItemHandler internal;
		private Map<Integer, Slot> customSlots = new HashMap<>();
		private boolean bound = false;

		public GuiContainerMod(int id, PlayerInventory inv, PacketBuffer extraData) {
			super(containerType, id);
			this.entity = inv.player;
			this.world = inv.player.world;
			this.internal = new ItemStackHandler(44);
			BlockPos pos = null;
			if (extraData != null) {
				pos = extraData.readBlockPos();
				this.x = pos.getX();
				this.y = pos.getY();
				this.z = pos.getZ();
			}
			if (pos != null) {
				if (extraData.readableBytes() == 1) { // bound to item
					byte hand = extraData.readByte();
					ItemStack itemstack;
					if (hand == 0)
						itemstack = this.entity.getHeldItemMainhand();
					else
						itemstack = this.entity.getHeldItemOffhand();
					itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				} else if (extraData.readableBytes() > 1) {
					extraData.readByte(); // drop padding
					Entity entity = world.getEntityByID(extraData.readVarInt());
					if (entity != null)
						entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
				} else { // might be bound to block
					TileEntity ent = inv.player != null ? inv.player.world.getTileEntity(pos) : null;
					if (ent != null) {
						ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							this.internal = capability;
							this.bound = true;
						});
					}
				}
			}
			this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 27, 72) {
			}));
			this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 45, 72) {
			}));
			this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 63, 72) {
			}));
			this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 81, 72) {
			}));
			this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 99, 72) {
			}));
			this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 117, 72) {
			}));
			this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 135, 72) {
			}));
			this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 153, 72) {
			}));
			this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 171, 72) {
			}));
			this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 27, 54) {
			}));
			this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 45, 54) {
			}));
			this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 63, 54) {
			}));
			this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 81, 54) {
			}));
			this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 99, 54) {
			}));
			this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 117, 54) {
			}));
			this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 135, 54) {
			}));
			this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 153, 54) {
			}));
			this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 171, 54) {
			}));
			this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 27, 36) {
			}));
			this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 45, 36) {
			}));
			this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 63, 36) {
			}));
			this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 81, 36) {
			}));
			this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 99, 36) {
			}));
			this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 117, 36) {
			}));
			this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 135, 36) {
			}));
			this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 153, 36) {
			}));
			this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 171, 36) {
			}));
			this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 27, 18) {
			}));
			this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 45, 18) {
			}));
			this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 63, 18) {
			}));
			this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 81, 18) {
			}));
			this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 99, 18) {
			}));
			this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 117, 18) {
			}));
			this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 135, 18) {
			}));
			this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 153, 18) {
			}));
			this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 171, 18) {
			}));
			this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 9, 18) {
			}));
			this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 9, 36) {
			}));
			this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 9, 54) {
			}));
			this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 9, 72) {
			}));
			this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 189, 18) {
			}));
			this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 189, 36) {
			}));
			this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 189, 54) {
			}));
			this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 189, 72) {
			}));
			int si;
			int sj;
			for (si = 0; si < 3; ++si)
				for (sj = 0; sj < 9; ++sj)
					this.addSlot(new Slot(inv, sj + (si + 1) * 9, 19 + 8 + sj * 18, 20 + 84 + si * 18));
			for (si = 0; si < 9; ++si)
				this.addSlot(new Slot(inv, si, 19 + 8 + si * 18, 20 + 142));
		}

		public Map<Integer, Slot> get() {
			return customSlots;
		}

		@Override
		public boolean canInteractWith(PlayerEntity player) {
			return true;
		}

		@Override
		public ItemStack transferStackInSlot(PlayerEntity playerIn, int index) {
			ItemStack itemstack = ItemStack.EMPTY;
			Slot slot = (Slot) this.inventorySlots.get(index);
			if (slot != null && slot.getHasStack()) {
				ItemStack itemstack1 = slot.getStack();
				itemstack = itemstack1.copy();
				if (index < 44) {
					if (!this.mergeItemStack(itemstack1, 44, this.inventorySlots.size(), true)) {
						return ItemStack.EMPTY;
					}
					slot.onSlotChange(itemstack1, itemstack);
				} else if (!this.mergeItemStack(itemstack1, 0, 44, false)) {
					if (index < 44 + 27) {
						if (!this.mergeItemStack(itemstack1, 44 + 27, this.inventorySlots.size(), true)) {
							return ItemStack.EMPTY;
						}
					} else {
						if (!this.mergeItemStack(itemstack1, 44, 44 + 27, false)) {
							return ItemStack.EMPTY;
						}
					}
					return ItemStack.EMPTY;
				}
				if (itemstack1.getCount() == 0) {
					slot.putStack(ItemStack.EMPTY);
				} else {
					slot.onSlotChanged();
				}
				if (itemstack1.getCount() == itemstack.getCount()) {
					return ItemStack.EMPTY;
				}
				slot.onTake(playerIn, itemstack1);
			}
			return itemstack;
		}

		@Override /** 
					* Merges provided ItemStack with the first avaliable one in the container/player inventor between minIndex (included) and maxIndex (excluded). Args : stack, minIndex, maxIndex, negativDirection. /!\ the Container implementation do not check if the item is valid for the slot
					*/
		protected boolean mergeItemStack(ItemStack stack, int startIndex, int endIndex, boolean reverseDirection) {
			boolean flag = false;
			int i = startIndex;
			if (reverseDirection) {
				i = endIndex - 1;
			}
			if (stack.isStackable()) {
				while (!stack.isEmpty()) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot = this.inventorySlots.get(i);
					ItemStack itemstack = slot.getStack();
					if (slot.isItemValid(itemstack) && !itemstack.isEmpty() && areItemsAndTagsEqual(stack, itemstack)) {
						int j = itemstack.getCount() + stack.getCount();
						int maxSize = Math.min(slot.getSlotStackLimit(), stack.getMaxStackSize());
						if (j <= maxSize) {
							stack.setCount(0);
							itemstack.setCount(j);
							slot.putStack(itemstack);
							flag = true;
						} else if (itemstack.getCount() < maxSize) {
							stack.shrink(maxSize - itemstack.getCount());
							itemstack.setCount(maxSize);
							slot.putStack(itemstack);
							flag = true;
						}
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			if (!stack.isEmpty()) {
				if (reverseDirection) {
					i = endIndex - 1;
				} else {
					i = startIndex;
				}
				while (true) {
					if (reverseDirection) {
						if (i < startIndex) {
							break;
						}
					} else if (i >= endIndex) {
						break;
					}
					Slot slot1 = this.inventorySlots.get(i);
					ItemStack itemstack1 = slot1.getStack();
					if (itemstack1.isEmpty() && slot1.isItemValid(stack)) {
						if (stack.getCount() > slot1.getSlotStackLimit()) {
							slot1.putStack(stack.split(slot1.getSlotStackLimit()));
						} else {
							slot1.putStack(stack.split(stack.getCount()));
						}
						slot1.onSlotChanged();
						flag = true;
						break;
					}
					if (reverseDirection) {
						--i;
					} else {
						++i;
					}
				}
			}
			return flag;
		}

		@Override
		public void onContainerClosed(PlayerEntity playerIn) {
			super.onContainerClosed(playerIn);
			if (!bound && (playerIn instanceof ServerPlayerEntity)) {
				if (!playerIn.isAlive() || playerIn instanceof ServerPlayerEntity && ((ServerPlayerEntity) playerIn).hasDisconnected()) {
					for (int j = 0; j < internal.getSlots(); ++j) {
						playerIn.dropItem(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
					}
				} else {
					for (int i = 0; i < internal.getSlots(); ++i) {
						playerIn.inventory.placeItemBackInInventory(playerIn.world,
								internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
					}
				}
			}
		}

		private void slotChanged(int slotid, int ctype, int meta) {
			if (this.world != null && this.world.isRemote()) {
				BalancedCratesMod.PACKET_HANDLER.sendToServer(new GUISlotChangedMessage(slotid, x, y, z, ctype, meta));
				handleSlotAction(entity, slotid, ctype, meta, x, y, z);
			}
		}
	}

	public static class ButtonPressedMessage {
		int buttonID, x, y, z;

		public ButtonPressedMessage(PacketBuffer buffer) {
			this.buttonID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
		}

		public ButtonPressedMessage(int buttonID, int x, int y, int z) {
			this.buttonID = buttonID;
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public static void buffer(ButtonPressedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.buttonID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
		}

		public static void handler(ButtonPressedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	public static class GUISlotChangedMessage {
		int slotID, x, y, z, changeType, meta;

		public GUISlotChangedMessage(int slotID, int x, int y, int z, int changeType, int meta) {
			this.slotID = slotID;
			this.x = x;
			this.y = y;
			this.z = z;
			this.changeType = changeType;
			this.meta = meta;
		}

		public GUISlotChangedMessage(PacketBuffer buffer) {
			this.slotID = buffer.readInt();
			this.x = buffer.readInt();
			this.y = buffer.readInt();
			this.z = buffer.readInt();
			this.changeType = buffer.readInt();
			this.meta = buffer.readInt();
		}

		public static void buffer(GUISlotChangedMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.slotID);
			buffer.writeInt(message.x);
			buffer.writeInt(message.y);
			buffer.writeInt(message.z);
			buffer.writeInt(message.changeType);
			buffer.writeInt(message.meta);
		}

		public static void handler(GUISlotChangedMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				PlayerEntity entity = context.getSender();
				int slotID = message.slotID;
				int changeType = message.changeType;
				int meta = message.meta;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleSlotAction(entity, slotID, changeType, meta, x, y, z);
			});
			context.setPacketHandled(true);
		}
	}

	static void handleButtonAction(PlayerEntity entity, int buttonID, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			CrateCloseProcedure.executeProcedure(Stream
					.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x), new AbstractMap.SimpleEntry<>("y", y),
							new AbstractMap.SimpleEntry<>("z", z), new AbstractMap.SimpleEntry<>("entity", entity))
					.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		}
	}

	private static void handleSlotAction(PlayerEntity entity, int slotID, int changeType, int meta, int x, int y, int z) {
		World world = entity.world;
		// security measure to prevent arbitrary chunk generation
		if (!world.isBlockLoaded(new BlockPos(x, y, z)))
			return;
	}
}
