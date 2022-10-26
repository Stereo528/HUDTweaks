package io.github.stereo528.hud_tweaks.mixin;

import com.mojang.blaze3d.vertex.PoseStack;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static io.github.stereo528.hud_tweaks.HUDTweaksClient.LOGGER;

@Environment(EnvType.CLIENT)
@Mixin(Gui.class)
public class GuiMixin {

	private static final Minecraft client = Minecraft.getInstance();

	@Inject(method = "render", at = @At("TAIL"))
	public void renderMyBullshit(PoseStack poseStack, float timeDelta, CallbackInfo cir) {
		if (!client.options.renderDebug) {
			poseStack.pushPose();
			client.font.drawShadow(poseStack, "deez nutz", 0, 0, 16777215);
			poseStack.popPose();
		}

	}
}
