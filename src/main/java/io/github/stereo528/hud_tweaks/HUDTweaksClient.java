package io.github.stereo528.hud_tweaks;

import eu.midnightdust.lib.config.MidnightConfig;
import io.github.stereo528.hud_tweaks.config.HUDConfig;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HUDTweaksClient implements ClientModInitializer {

	public static final String MODID = "hud_tweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger("HUDTweaks");

	@Override
	public void onInitializeClient(ModContainer mod) {
		MidnightConfig.init(MODID, HUDConfig.class);
		LOGGER.info(MODID + "Mod Loaded...");
	}

}
