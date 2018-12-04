import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private Properties properties;
    private InputStream inputStream = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");

    public ReadProperties() {
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getAppUser() {
        return properties.getProperty("appUser");
    }

    public String getEnvironment() {
        return properties.getProperty("environment");
    }

    public String getUserPassword() {
        return properties.getProperty("userPass");
    }

}
