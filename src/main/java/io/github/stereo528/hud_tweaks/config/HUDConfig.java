package io.github.stereo528.hud_tweaks.config;

import eu.midnightdust.lib.config.MidnightConfig;

public class HUDConfig extends MidnightConfig {
	@Entry public static boolean fps = true;
	@Entry public static boolean coords = true;
	@Entry public static boolean cpu = false;
	@Entry public static boolean gpu = false;
	@Entry public static boolean cpuUsage = false;
	@Entry public static boolean gpuUsage = false;
	@Entry public static boolean cpuAndGpuOnRight = true;
}
