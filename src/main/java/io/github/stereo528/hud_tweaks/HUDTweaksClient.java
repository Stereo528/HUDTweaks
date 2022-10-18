package io.github.stereo528.hud_tweaks;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HUDTweaksClient implements ClientModInitializer {

	public static final String MODID = "hud_tweaks";
	public static final Logger LOGGER = LoggerFactory.getLogger("HUDTweaks");

	@Override
	public void onInitializeClient(ModContainer mod) {
		LOGGER.info(MODID + "AAAAAAAAAAAAAAAAAAAAAAA");
	}

}
