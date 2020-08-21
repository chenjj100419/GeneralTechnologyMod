package io.github.chenjj100419.generaltechnology.generaltechnology.item;

import io.github.chenjj100419.generaltechnology.generaltechnology.Generaltechnology;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Generaltechnology.MOD_ID)
public class ItemLoader {
    private static Item[] items = {
        new Item().setRegistryName("admin_enderio_authoritycard").setCreativeTab(CreativeTabs.REDSTONE)
    };
}

