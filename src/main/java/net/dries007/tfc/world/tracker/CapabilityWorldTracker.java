package net.dries007.tfc.world.tracker;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

import net.dries007.tfc.util.Helpers;
import net.dries007.tfc.util.NoopStorage;

public class CapabilityWorldTracker
{
    @CapabilityInject(IWorldTracker.class)
    public static final Capability<IWorldTracker> CAPABILITY = Helpers.notNull();
    public static final ResourceLocation KEY = Helpers.identifier("world_tracker");

    public static void setup()
    {
        CapabilityManager.INSTANCE.register(IWorldTracker.class, new NoopStorage<>(), WorldTracker::new);
    }
}