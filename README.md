### Example to show issue when using @KeyFormat with @ConfigurationProperties

**Micronaut version: 2.1.0**

Simple configuration using `@ConfigurationProperties` annotation

```
@Data
@ConfigurationProperties("conf")
public class MyConfig {
    @MapFormat(keyFormat = RAW)
    private Map<String, String> animals;
}
```

The `@MapFormat(keyFormat = RAW)` annotation on the map should ensure that the key values are not formatted.

When used with the corresponding yaml config:

```
conf:
  animals:
    VERY_FAST: rabbit
    VERY_SLOW: turtle
```

The following test assertion fails when checking the keys:
```
assertThat(config.getAnimals()).containsKeys("VERY_FAST", "VERY_SLOW");
```

