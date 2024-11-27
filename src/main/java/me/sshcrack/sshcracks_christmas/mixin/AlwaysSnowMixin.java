package me.sshcrack.sshcracks_christmas.mixin;

import me.sshcrack.sshcracks_christmas.SshcracksChristmas;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Biome.class)
public abstract class AlwaysSnowMixin {
    @Shadow
    @Deprecated
    protected abstract float getTemperature(BlockPos blockPos);

    @Inject(method = "doesNotSnow", at = @At("HEAD"), cancellable = true)
    public void sshcracks_christmas$doesNotSnow(BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
        if (!SshcracksChristmas.CONFIG.changeSnowThreshold())
            return;

        // 0.8f is the temperature of plains biome
        cir.setReturnValue(this.getTemperature(pos) > SshcracksChristmas.CONFIG.maxTemperatureToSnow());
    }


}
