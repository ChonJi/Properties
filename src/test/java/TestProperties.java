import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;

public class TestProperties {

    private static ReadProperties readProperties = new ReadProperties();

    public static void main(String[] args) {
        System.out.println(readProperties.getAppUser());
        System.out.println(readProperties.getEnvironment());
        System.out.println(readProperties.getUserPassword());
    }

    @Test
    private void propertiesShouldNotBeNull() {
        assertNotNull(readProperties.getAppUser());
        assertNotNull(readProperties.getEnvironment());
        assertNotNull(readProperties.getUserPassword());
    }

}