import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

    private Properties properties;

    public ReadProperties() {
        properties = new Properties();
        final InputStream inputStream = ReadProperties.class.getClassLoader().getResourceAsStream("config.properties");
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
