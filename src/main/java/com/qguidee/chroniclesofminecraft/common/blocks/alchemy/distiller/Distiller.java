package com.qguidee.chroniclesofminecraft.common.blocks.alchemy.distiller;

import net.minecraft.block.Block;
import net.minecraft.util.BlockRenderLayer;

import javax.annotation.Nonnull;

public class Distiller extends Block {

    public Distiller(Properties properties) {
        super(properties);
    }

    @Nonnull
    @Override
    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
