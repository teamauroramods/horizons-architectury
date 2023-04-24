package com.teamauroramods.horizons.fabric;

import com.teamauroramods.horizons.Horizons;
import net.fabricmc.api.ModInitializer;

public class HorizonsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Horizons.init();
    }
}
