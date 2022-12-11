package io.github.stereo528.hud_tweaks.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import io.github.stereo528.hud_tweaks.config.HUDConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
@Mixin(Gui.class)
public class GuiMixin {

	private static final Minecraft client = Minecraft.getInstance();

	@Inject(method = "render", at = @At("TAIL"))
	public void renderMyBullshit(PoseStack poseStack, float timeDelta, CallbackInfo cir) {
		if (!client.options.renderDebug) {
			poseStack.pushPose();
			if(HUDConfig.fps) client.font.drawShadow(poseStack, ((MinecraftMixin) client).getFPS() + " FPS", 0, 0, 16777215);
			poseStack.popPose();
		}

	}
}
