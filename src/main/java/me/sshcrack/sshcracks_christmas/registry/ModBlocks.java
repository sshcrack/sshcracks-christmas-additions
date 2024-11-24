package me.sshcrack.sshcracks_christmas.registry;

import me.sshcrack.sshcracks_christmas.block.MugBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block CANDYCANE_MUG = registerMug("candycane_mug");
    public static final Block CREEPER_MUG = registerMug("creeper_mug");
    public static final Block FLNALLE_MUG = registerMug("flannel_mug");
    public static final Block GINGERBREAD_MUG = registerMug("gingerbread_mug");
    public static final Block PRESENT_MUG = registerMug("present_mug");
    public static final Block SNOWFLAKES_MUG = registerMug("snowflakes_mug");
    public static final Block SNOWMAN_MUG = registerMug("snowman_mug");
    public static final Block SPOTS_MUG = registerMug("spots_mug");

    public static Block registerMug(String name) {
        return register(
                new MugBlock(AbstractBlock.Settings.create().breakInstantly().nonOpaque().pistonBehavior(PistonBehavior.DESTROY)),
                name,
                true
        );
    }

    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = ChristRef.id(name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void initialize() {}
}
