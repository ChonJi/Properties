import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.assertNotNull;

public class TestProperties {

    private static ReadProperties readProperties = new ReadProperties();

    public static void main(String[] args) throws IOException {
        System.out.println(readProperties.getAppUser());
        System.out.println(readProperties.getEnvironment());
        System.out.println(readProperties.getUserPassword());
    }

    @Test
    private void propertiesShouldNotBeNull() throws IOException{
        assertNotNull(readProperties.getAppUser());
        assertNotNull(readProperties.getEnvironment());
        assertNotNull(readProperties.getUserPassword());
    }

}