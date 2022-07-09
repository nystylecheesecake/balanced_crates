
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package balanced.crates.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BalancedCratesModTabs {
	public static CreativeModeTab TAB_BALANCED_CRATES;

	public static void load() {
		TAB_BALANCED_CRATES = new CreativeModeTab("tabbalanced_crates") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BalancedCratesModBlocks.CRATE_UI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
