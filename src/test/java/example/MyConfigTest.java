package example;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@MicronautTest
public class MyConfigTest {

    @Inject
    private MyConfig config;

    @Test
    void configKeys() {
        assertThat(config.getAnimals()).containsKeys("VERY_FAST", "VERY_SLOW");
    }

}
