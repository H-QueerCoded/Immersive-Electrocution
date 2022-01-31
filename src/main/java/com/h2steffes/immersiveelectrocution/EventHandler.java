package com.h2steffes.immersiveelectrocution;


import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import blusunrize.immersiveengineering.common.util.IEDamageSources.ElectricDamageSource;

public class EventHandler {

	@SubscribeEvent
	public void onHurt(LivingAttackEvent event) {
		if(event.getSource() instanceof ElectricDamageSource && !event.getEntity().onGround) {
			ElectricDamageSource dmg = (ElectricDamageSource) event.getSource();
			dmg.dmg = 0;
			event.setCanceled(true);
		}
	}
}
