package net.jay.moreenchants.enchantments;

import net.minecraft.client.MinecraftClient;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.Vec3d;

import java.util.Random;

public class FlairEnchantment extends Enchantment {
    public FlairEnchantment() {
        super(Rarity.UNCOMMON, EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND });
    }

    @Override
    public int getMinPower(int level) {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        MinecraftClient mc = MinecraftClient.getInstance();

        if(target instanceof LivingEntity) {
            Vec3d targetPos = target.getPos();

            for(int i = 0; i < 7 * level; i++) {
                mc.particleManager.addParticle(ParticleTypes.TOTEM_OF_UNDYING, targetPos.x + getRandomNumber(-1, 1), targetPos.y + 2 + getRandomNumber(-0.5, 1), targetPos.z + getRandomNumber(-1, 1), getRandomNumber(-1.5, 1.5), 1, getRandomNumber(-1.5, 1.5));
            }
        }
    }

    private double getRandomNumber(double min, double max) {
        return ((Math.random() * (max - min)) + min);
    }
}
