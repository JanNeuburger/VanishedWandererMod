package at.boolejan.whitewyvern.items;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class RakanionBlockItem extends BlockItem {

    public RakanionBlockItem(Block blockIn) {
        super(blockIn, new Item.Properties()
            .group(ItemGroup.BUILDING_BLOCKS)
        );
    }
}
