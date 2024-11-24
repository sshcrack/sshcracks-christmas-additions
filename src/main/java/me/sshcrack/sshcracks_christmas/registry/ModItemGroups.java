package me.sshcrack.sshcracks_christmas.registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ModItemGroups {
    public static final ItemGroup CHRISTMAS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.SNOWMAN_MUG))
            .displayName(Text.translatable("itemGroup.sshcracks_christmas.main_group"))
            .entries((context, entries) -> {
                entries.add(ModBlocks.CANDYCANE_MUG);
                entries.add(ModBlocks.CREEPER_MUG);
                entries.add(ModBlocks.FLNALLE_MUG);
                entries.add(ModBlocks.GINGERBREAD_MUG);
                entries.add(ModBlocks.PRESENT_MUG);
                entries.add(ModBlocks.SNOWFLAKES_MUG);
                entries.add(ModBlocks.SNOWMAN_MUG);
                entries.add(ModBlocks.SPOTS_MUG);
            })
            .build();

    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, ChristRef.id("main_group"), CHRISTMAS_GROUP);
    }
}
