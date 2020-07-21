package framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    private final static Properties properties = new Properties();

    private static TestProperties INSTANCE = null;

    private  TestProperties() {
        try {
            properties.load(new FileInputStream(new File("src/main/resources/application.properties")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Properties getProperties() {
        if(INSTANCE == null){
            INSTANCE = new TestProperties();
        }
        return properties;
    }
}
