package net.bige.tutorialmod.item;

import net.bige.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //actual item registration here
    public static final Item TESTING_ITEM = registerItem("testing_item", new Item(new Item.Settings()));

    //this is to register the item into the game files
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), item);
    }

    //this is to register that there are items in the dsl modpack
    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering items for mod: " + TutorialMod.MOD_ID);

//        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
//            fabricItemGroupEntries.add();
//        });
    }
}
