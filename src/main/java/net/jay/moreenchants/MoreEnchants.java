package net.jay.moreenchants;

import net.fabricmc.api.ModInitializer;
import net.jay.moreenchants.enchantments.FlairEnchantment;
import net.jay.moreenchants.enchantments.SlownessEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MoreEnchants implements ModInitializer {
	private static Enchantment SLOWNESSENCHANTMENT = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("moreenchants", "slowness"),
			new SlownessEnchantment()
	);

	private static Enchantment FLAIRENCHANTMENT = Registry.register(
			Registry.ENCHANTMENT,
			new Identifier("moreenchants", "flair"),
			new FlairEnchantment()
	);

	@Override
	public void onInitialize() {

	}
}
