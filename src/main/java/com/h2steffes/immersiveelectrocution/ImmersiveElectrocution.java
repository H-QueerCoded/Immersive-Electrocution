package com.h2steffes.immersiveelectrocution;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = ImmersiveElectrocution.MODID, name = ImmersiveElectrocution.NAME, version = ImmersiveElectrocution.VERSION)
public class ImmersiveElectrocution
{
    public static final String MODID = "immersiveelectrocution";
    public static final String NAME = "Immersive Electrocution";
    public static final String VERSION = "1.0";
    
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	MinecraftForge.EVENT_BUS.register(new EventHandler());
    }
}
