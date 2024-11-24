package me.sshcrack.sshcracks_christmas;

import me.sshcrack.sshcracks_christmas.registry.ChristRef;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;

public class SshcracksChristmasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        var container = FabricLoader.getInstance().getModContainer(SshcracksChristmas.MOD_ID);
        assert container.isPresent();

        ResourceManagerHelper.registerBuiltinResourcePack(ChristRef.id("christmas_pack"),
                container.get(),
                Text.translatable("sshcracks_christmas.resource_pack"),
                ResourcePackActivationType.DEFAULT_ENABLED);
    }
}