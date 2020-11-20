package net.glease.cofhcorefix;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

@IFMLLoadingPlugin.TransformerExclusions("net.glease.cofhcorefix.")
@IFMLLoadingPlugin.SortingIndex(2000)
@IFMLLoadingPlugin.DependsOn("cofh.asm.LoadingPlugin")
public class LoadingPlugin implements IFMLLoadingPlugin {
    static boolean runtimeDeobfEnabled;

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{"net.glease.cofhcorefix.WorldTransformer"};
    }

    @Override
    public String getModContainerClass() {
        return null;
    }

    @Override
    public String getSetupClass() {
        return null;
    }

    @Override
    public void injectData(Map<String, Object> data) {
        runtimeDeobfEnabled = (Boolean) data.get("runtimeDeobfuscationEnabled");
    }

    @Override
    public String getAccessTransformerClass() {
        return null;
    }
}
