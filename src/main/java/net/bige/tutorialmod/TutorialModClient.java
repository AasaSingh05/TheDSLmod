package net.bige.tutorialmod;

import net.bige.tutorialmod.block.ModBlocks;
import net.bige.tutorialmod.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class TutorialModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
