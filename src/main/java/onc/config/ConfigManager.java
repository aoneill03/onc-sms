package onc.config;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;


public class ConfigManager
{
    private static ConfigManager mInstance = null;

    private static final String CONFIG_FILE = "config.properties";

    private Properties mProperties;

    public static ConfigManager getInstance()
    {
        if (mInstance == null) {
            mInstance = new ConfigManager();
        }
        return mInstance;
    }

    private ConfigManager()
    {
        try {
            // get config file as input stream
            InputStream input = getClass().getClassLoader().getResourceAsStream(CONFIG_FILE);
            // initialized class property holder
            this.mProperties = new Properties();
            // load config.properties into memory
            this.mProperties.load(input);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param key - Key of property defined in ./src/main/resources/config.properties
     * @return value of key in config.properties or null if doesn't exist
     */
    public String getProperty(String key) {
        return mProperties.getProperty(key);
    }
}