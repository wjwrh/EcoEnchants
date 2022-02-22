package com.willfp.ecoenchants.enchantments.ecoenchants.artifact;

import com.willfp.ecoenchants.enchantments.itemtypes.Artifact;
import org.bukkit.Particle;
import org.jetbrains.annotations.NotNull;

public class GlowArtifact extends Artifact {
    public GlowArtifact() {
        super(
                "glow_artifact"
        );
    }

    @Override
    public @NotNull Particle getParticle() {
        return Particle.GLOW;
    }
}
