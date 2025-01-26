package com.apeng.filtpick;

import com.apeng.filtpick.config.FiltPickClientConfig;
import com.apeng.filtpick.config.FiltPickServerConfig;
import com.apeng.filtpick.gui.screen.FiltPickMenu;
import com.apeng.filtpick.network.NetworkHandler;
import net.minecraft.world.inventory.MenuType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// This class is part of the common project meaning it is shared between all supported loaders. Code written here can only
// import and access the vanilla codebase, libraries used by vanilla, and optionally third party libraries that provide
// common compatible binaries. This means common code can not directly use loader specific concepts such as Forge events
// however it will be compatible with all supported mod loaders.
public class Common {

    public static final String MOD_NAME = "FiltPick";
    public static final Logger LOG = LoggerFactory.getLogger(MOD_NAME);
    public static final String MOD_ID = "filtpick";
    // Remember to initialize values below in mod loader specific implementation
    public static NetworkHandler networkHandler;
    public static MenuType<FiltPickMenu> filtPickMenuMenuType;
    public static FiltPickClientConfig CLIENT_CONFIG;
    public static FiltPickServerConfig SERVER_CONFIG;

    // The loader specific projects are able to import and use any code from the common project. This allows you to
    // write the majority of your code here and load it from your loader specific projects. This example has some
    // code that gets invoked by the entry point of the loader specific projects.
    public static void init(NetworkHandler networkHandlerImpl, MenuType<FiltPickMenu> filtPickMenuMenuType) {
        Common.networkHandler = networkHandlerImpl;
        Common.filtPickMenuMenuType = filtPickMenuMenuType;
    }
}
