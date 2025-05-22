package net.bige.tutorialmod.block;

import net.bige.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Declaring and initialized the new block
    public static final Block TESTING_BLOCK = registerBlock("testing_block",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.SCULK_SHRIEKER)
            ));


    //adding the block intot he game
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID,name), block);
    }

    //registering the block item into the game
    private static void registerBlockItem(String Name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, Name),
                new BlockItem(block, new Item.Settings())
        );
    }


    public static void registerModBlocks(){
        TutorialMod.LOGGER.info("Registering Mod blocks related to : " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.TESTING_BLOCK);
        });
    }
}
