
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balanced.crates.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import balanced.crates.client.gui.LargeCrateGUIScreen;
import balanced.crates.client.gui.CrateGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BalancedCratesModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(BalancedCratesModMenus.CRATE_GUI, CrateGUIScreen::new);
			MenuScreens.register(BalancedCratesModMenus.LARGE_CRATE_GUI, LargeCrateGUIScreen::new);
		});
	}
}
