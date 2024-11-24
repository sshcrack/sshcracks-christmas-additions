package me.sshcrack.sshcracks_christmas.registry;

import me.sshcrack.sshcracks_christmas.SshcracksChristmas;
import net.minecraft.util.Identifier;

public class ChristRef {
    public static Identifier id(String path) {
        return Identifier.of(SshcracksChristmas.MOD_ID, path);
    }
}
