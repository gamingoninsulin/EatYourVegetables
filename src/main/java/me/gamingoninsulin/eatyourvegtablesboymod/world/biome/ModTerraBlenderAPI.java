package me.gamingoninsulin.eatyourvegtablesboymod.world.biome;

import me.gamingoninsulin.eatyourvegtablesboymod.Reference;
import me.gamingoninsulin.eatyourvegtablesboymod.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(Reference.MOD_ID, "overworld"), 4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Reference.MOD_ID, ModMaterialRules.makeRules());
    }
}