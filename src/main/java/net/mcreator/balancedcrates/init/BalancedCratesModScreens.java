
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.balancedcrates.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.balancedcrates.client.gui.LargeCrateGUIScreen;
import net.mcreator.balancedcrates.client.gui.CrateGUIScreen;

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
