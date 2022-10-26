package io.github.stereo528.hud_tweaks.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "hudtweaks")
public class HUDConfig implements ConfigData {
	public boolean fps = true;
	public boolean coords = true;

	public boolean gpu = false;
	public boolean cpu = false;

	public boolean cpu_and_gpu_on_right = true;

	public boolean gpu_usage = false;
	public boolean cpu_usage = false;
}
