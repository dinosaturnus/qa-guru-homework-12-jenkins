package properties;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.lang.String.format;


public class SystemProperties {

    public static String browserProperty = System.getProperty("browser", "chrome");
    public static String browserSizeProperty = System.getProperty("browserSize", "1920x1080");
    public static String browserVersionProperty = System.getProperty("browserVersion", "112.0.5615.137");
    public static String baseUrlProperty = System.getProperty("baseUrl", "https://demoqa.com");
    public static String remoteSelenoidProperty = System.getProperty("remoteSelenoidUrl", "https://user1:1234@selenoid.autotests.cloud/wd/hub");


/*
    @Test
    void systemPropertiesTest1() {
        System.setProperty("browser", "chrome"); // внутренне хранилище ключей-значений в джаве
        String browser = System.getProperty("browser");

        System.out.println(browser); // chrome
    }

    @Test
    void systemPropertiesTest2() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // chrome
    }

    @Test
    void systemPropertiesTest3() {
        System.setProperty("browser", "chrome");
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // chrome
    }

    @Test
    @Tag("test")
    void systemPropertiesTest4() {
        String browser = System.getProperty("browser", "mozilla");

        System.out.println(browser); // chrome
    }

    // gradle property test // mozilla
    //gradle property_test -Dbrowser=opera // opera

    @Test
    @Tag("hello")
    void systemPropertiesTest5() {
        String name = System.getProperty("name", "alice");
        String message = format("Hello, %s!", name);

        System.out.println(message);

        // gradle hello_test // Hello, alice!

    }
*/


}
