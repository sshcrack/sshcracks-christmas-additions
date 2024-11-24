package me.sshcrack.sshcracks_christmas;

import me.sshcrack.sshcracks_christmas.registry.ModBlocks;
import me.sshcrack.sshcracks_christmas.registry.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SshcracksChristmas implements ModInitializer {
    public static final String MOD_ID = "sshcracks_christmas";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItemGroups.initialize();
    }
}