package net.bige.tutorialmod.block;

import net.bige.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(){

    }

    //registering the block item into the game
    private static void registerBlockItem(String Name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, Name),
                new BlockItem(block, new Item.Settings());
        )
    }


    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod blocks related to : " + TutorialMod.MOD_ID);
    }
}
