package example;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.convert.format.MapFormat;
import lombok.Data;

import java.util.Map;

import static io.micronaut.core.naming.conventions.StringConvention.RAW;

@Data
@ConfigurationProperties("conf")
public class MyConfig {
    @MapFormat(keyFormat = RAW)
    private Map<String, String> animals;
}
