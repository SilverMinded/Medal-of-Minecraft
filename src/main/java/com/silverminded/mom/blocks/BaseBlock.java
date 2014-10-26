package com.silverminded.mom.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by J0QUE on 26-10-2014.
 */
public class BaseBlock extends Block {


    @Deprecated
    public BaseBlock() {
        super(Material.rock);
    }

    public BaseBlock(String name) {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(1.0F);
        GameRegistry.registerBlock(this, name);
    }

    public BaseBlock(String name, Float hardness) {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        GameRegistry.registerBlock(this, name);
    }

    public BaseBlock(String name, CreativeTabs tabs) {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(tabs);
        this.setHardness(1.0F);
        GameRegistry.registerBlock(this, name);
    }

    public BaseBlock(String name, CreativeTabs tabs, Float hardness) {
        super(Material.rock);
        this.setBlockName(name);
        this.setCreativeTab(tabs);
        this.setHardness(hardness);
        GameRegistry.registerBlock(this, name);
    }

    public BaseBlock(String name, Material material) {
        super(material);
        this.setBlockName(name);
        GameRegistry.registerBlock(this, name);
        this.setHardness(1.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public BaseBlock(String name, Material material, Float hardness) {
        super(material);
        this.setBlockName(name);
        GameRegistry.registerBlock(this, name);
        this.setHardness(hardness);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public BaseBlock(String name, CreativeTabs tabs, Material material) {
        super(material);
        this.setBlockName(name);
        this.setCreativeTab(tabs);
        this.setHardness(1.0F);
        GameRegistry.registerBlock(this, name);
    }

    public BaseBlock(String name, CreativeTabs tabs, Material material, Float hardness) {
        super(material);
        this.setBlockName(name);
        this.setCreativeTab(tabs);
        this.setHardness(hardness);
        GameRegistry.registerBlock(this, name);
    }


}