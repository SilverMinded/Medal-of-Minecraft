package com.silverminded.mom;

import com.silverminded.mom.blocks.Blocks;
import com.silverminded.mom.lib.Modname;
import com.silverminded.mom.lib.Strings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by J0QUE on 25-10-2014.
 */
@Mod(modid = Strings.MODID + Strings.BLOCKSUFFIX, name = Strings.BLOCKNAME, version = Strings.VERSION, dependencies = Strings.DEPMODULE)
public class MoMBlocks {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Blocks.init(Modname.Block);
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
