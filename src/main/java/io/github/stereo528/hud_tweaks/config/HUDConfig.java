package io.github.stereo528.hud_tweaks.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "hudtweaks")
public class HUDConfig implements ConfigData {
	@Comment("Shows your FPS")
    @ConfigEntry.Gui.Tooltip
	public boolean fps = true;
	
	@Comment("Shows your XYZ Coordinates")
    @ConfigEntry.Gui.Tooltip
	public boolean coords = true;
	
	@Comment("Your Pos/Neg XZ Direction")
    @ConfigEntry.Gui.Tooltip
	public boolean facing = true;
	
	@Comment("Your North, East, South, West facing direction")
    @ConfigEntry.Gui.Tooltip
	public boolean nesw = true;

	@Comment("CPU Brand/Model")
    @ConfigEntry.Gui.Tooltip
	public boolean gpu = false;
	
	@Comment("GPU Brand/Model")
    @ConfigEntry.Gui.Tooltip
	public boolean cpu = false;


	public boolean gpu_usage = false;
	public boolean cpu_usage = false;
	
	@Comment("CPU/GPU & Usages on the top right instead of top left of the screen")
    @ConfigEntry.Gui.Tooltip
	public boolean cpu_and_gpu_on_right = true;
}
