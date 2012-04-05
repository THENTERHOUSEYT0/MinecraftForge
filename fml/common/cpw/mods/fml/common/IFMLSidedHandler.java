package cpw.mods.fml.common;

import java.io.File;
import java.util.logging.Logger;

public interface IFMLSidedHandler
{
    Logger getMinecraftLogger();
    File getMinecraftRootDirectory();
    boolean isModLoaderMod(Class<?> clazz);
    ModContainer loadBaseModMod(Class<?> clazz, String canonicalPath);
    boolean isServer();
    boolean isClient();
}
