package utils;/*
 *
 * created by himanshu on 08/10/20
 *
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    public static FileInputStream fis;

    public static String readPropertyFile(String key) throws IOException {
        String filePath = System.getProperty("user.dir") + "/config/config.properties";
        fis = new FileInputStream(filePath);
        Properties property = new Properties();
        property.load(fis);
        return property.getProperty(key);
    }
}

