package com.romilo903.veryrandommod;

import com.romilo903.veryrandommod.init.ItemInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("veryrandom")
public class VeryRandomMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "veryrandom";
    public static VeryRandomMod instance;

    public VeryRandomMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {}

    private void doClientStuff(final FMLClientSetupEvent event) {}

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}

    public static final ItemGroup ItemTab = new ItemGroup("veryrandommod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.plastic_fragment);
        }
    };
}
