
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balanced.crates.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import balanced.crates.world.inventory.LargeCrateGUIMenu;
import balanced.crates.world.inventory.CrateGUIMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BalancedCratesModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<CrateGUIMenu> CRATE_GUI = register("crate_gui", (id, inv, extraData) -> new CrateGUIMenu(id, inv, extraData));
	public static final MenuType<LargeCrateGUIMenu> LARGE_CRATE_GUI = register("large_crate_gui",
			(id, inv, extraData) -> new LargeCrateGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
