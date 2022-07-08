
package balanced.crates.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import balanced.crates.block.CrateUIBlock;
import balanced.crates.BalancedCratesModElements;

@BalancedCratesModElements.ModElement.Tag
public class BalancedCratesItemGroup extends BalancedCratesModElements.ModElement {
	public BalancedCratesItemGroup(BalancedCratesModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbalanced_crates") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CrateUIBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
