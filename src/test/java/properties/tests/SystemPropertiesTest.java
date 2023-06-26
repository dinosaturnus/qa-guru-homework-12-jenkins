package properties.tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static java.lang.String.format;


public class SystemPropertiesTest {


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
    @Tag("property")
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

}
