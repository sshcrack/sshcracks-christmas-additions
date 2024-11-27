package me.sshcrack.sshcracks_christmas;

import me.sshcrack.sshcracks_christmas.registry.ChristRef;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelLoadingPlugin;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelModifier;
import net.fabricmc.fabric.api.client.model.loading.v1.ModelResolver;
import net.fabricmc.fabric.api.client.model.loading.v1.PreparableModelLoadingPlugin;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.render.model.UnbakedModel;
import net.minecraft.text.Text;
import org.jetbrains.annotations.Nullable;

public class SshcracksChristmasClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModelLoadingPlugin.register(new ModelLoadingPlugin() {
            @Override
            public void onInitializeModelLoader(Context context) {
            }
        });
        var container = FabricLoader.getInstance().getModContainer(SshcracksChristmas.MOD_ID);
        assert container.isPresent();

        ResourceManagerHelper.registerBuiltinResourcePack(ChristRef.id("christmas_pack"),
                container.get(),
                Text.translatable("sshcracks_christmas.resource_pack"),
                ResourcePackActivationType.DEFAULT_ENABLED);
    }
}