package me.sshcrack.sshcracks_christmas;

import io.wispforest.owo.config.Option;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;
import io.wispforest.owo.config.annotation.Sync;

@Modmenu(modId = SshcracksChristmas.MOD_ID)
@Config(name = "sshcracks_christmas", wrapperName = "ChristmasConfig")
public class ChristmasConfigModel {
    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public boolean changeSnowThreshold = true;

    @Sync(Option.SyncMode.OVERRIDE_CLIENT)
    public float maxTemperatureToSnow = 0.8F;
}
