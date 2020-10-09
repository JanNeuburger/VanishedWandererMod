package at.boolejan.whitewyvern.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RakanionBlock extends Block {

    public RakanionBlock() {
        super(Block.Properties.create(Material.GLASS)
                .hardnessAndResistance(3.5f, 0.3f)
                .harvestTool(ToolType.PICKAXE)
                .harvestLevel(3)
                .sound(SoundType.GLASS)
        );
    }
}
