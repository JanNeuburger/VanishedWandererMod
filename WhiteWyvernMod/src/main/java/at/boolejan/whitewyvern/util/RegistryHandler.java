package at.boolejan.whitewyvern.util;

import at.boolejan.whitewyvern.WhiteWyvern;
import at.boolejan.whitewyvern.blocks.RakanionBlock;
import at.boolejan.whitewyvern.items.RakanionShard;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WhiteWyvern.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, WhiteWyvern.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // region Items
    public static final RegistryObject<Item> RAKANION_SHARD = ITEMS.register("rakanion_shard", RakanionShard::new);
    // endregion Items

    // region Blocks
    public static final RegistryObject<Block> RAKANION_BLOCK = BLOCKS.register("rakanion_block", RakanionBlock::new);
    // endregion Blocks

    // region BlockItems

    // endregion BlockItems
}
