package dev.simonverhoeven.openrewritedemo.oldorgname;

import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:secretprops.properties")
@ConfigurationPropertiesScan("dev.simonverhoeven")
public class SampleConfiguration {
}
