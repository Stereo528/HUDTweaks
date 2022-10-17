package io.github.stereo528.hud_tweaks.mixin;

import io.github.stereo528.hud_tweaks.HUDTweaksClient;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(method = "init", at = @At("TAIL"))
	public void exampleMod$onInit(CallbackInfo ci) {
		HUDTweaksClient.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
