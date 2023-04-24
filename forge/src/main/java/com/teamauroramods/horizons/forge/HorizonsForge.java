package com.teamauroramods.horizons.forge;

import dev.architectury.platform.forge.EventBuses;
import com.teamauroramods.horizons.Horizons;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Horizons.MOD_ID)
public class HorizonsForge {
    public HorizonsForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Horizons.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Horizons.init();
    }
}
