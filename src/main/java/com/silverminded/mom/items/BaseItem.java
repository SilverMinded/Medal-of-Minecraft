package com.silverminded.mom.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by J0QUE on 25-10-2014.
 */
public class BaseItem extends Item {

    public BaseItem(){}

    public BaseItem(String name) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(CreativeTabs.tabMisc);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        GameRegistry.registerItem(this, name);

    }

    public BaseItem(String name, CreativeTabs tab, boolean dimensional) {

        this.setUnlocalizedName(name);
        this.setCreativeTab(tab);
        if (dimensional) this.isFull3D();
        GameRegistry.registerItem(this, name);

    }


}
