package com.commodorethrawn.strawgolem.entity.capability;

import com.commodorethrawn.strawgolem.Strawgolem;
import com.commodorethrawn.strawgolem.entity.EntityStrawGolem;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Strawgolem.MODID)
public class CapabilityHandler {
	
	public static final ResourceLocation LIFESPAN_RES = new ResourceLocation(Strawgolem.MODID, "lifespan");
    public static final ResourceLocation CROPSLOT_RES = new ResourceLocation(Strawgolem.MODID, "cropslot");

	@SubscribeEvent
	public static void onAttachCapability(AttachCapabilitiesEvent<Entity> event) {
        if (event.getObject() instanceof EntityStrawGolem) {
            event.addCapability(LIFESPAN_RES, new LifespanProvider());
            event.addCapability(CROPSLOT_RES, new InventoryProvider());
        }
    }

}
