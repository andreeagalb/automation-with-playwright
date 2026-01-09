package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static { // Static block runs once when the class is loaded
        try {
            FileInputStream file = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(file);
        } catch (Exception e) {
            System.out.println("Could not load configuration file!");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
