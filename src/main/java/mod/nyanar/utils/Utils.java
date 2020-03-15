package mod.nyanar.utils;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("utils")
public class Utils {
    public static final String MODID = "utils";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public Utils() {
        LOGGER.debug("Hello from Example Mod!");
    }
}
