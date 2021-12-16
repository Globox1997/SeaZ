package net.seaz.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "seaz")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class SeaConfig implements ConfigData {

    // @ConfigEntry.Category("spawn_setting")
    // @ConfigEntry.Gui.RequiresRestart
    // @ConfigEntry.BoundedDiscrete(min = 0, max = 100)
    // public int necromancer_spawn_weight = 1;

    // // Allow settings
    // @ConfigEntry.Category("spawn_setting")
    // public boolean allow_stone_golem_summoning = true;

    // // Misc settings
    // @ConfigEntry.Category("misc")
    // public boolean allow_source_stone_tp = true;

}