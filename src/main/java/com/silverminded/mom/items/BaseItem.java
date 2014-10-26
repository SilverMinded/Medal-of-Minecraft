package com.silverminded.mom.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by J0QUE on 25-10-2014.
 */
public class BaseItem extends Item {

    @Deprecated
    public BaseItem(){}

    public BaseItem(String name) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(64);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, Integer maxStackSize) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        this.setMaxStackSize(maxStackSize);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        this.setMaxStackSize(64);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab, Integer maxStackSize) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        this.setMaxStackSize(maxStackSize);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab, boolean dimensional) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        if (dimensional) this.isFull3D();
        this.setMaxStackSize(64);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab, boolean dimensional, Integer maxStackSize) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        if (dimensional) this.isFull3D();
        this.setMaxStackSize(maxStackSize);
        GameRegistry.registerItem(this, name);

    }


}
