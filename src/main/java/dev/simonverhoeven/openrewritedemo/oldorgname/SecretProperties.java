package dev.simonverhoeven.openrewritedemo.oldorgname;

import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConfigurationProperties(prefix = "secret")
@ConstructorBinding
public class SecretProperties {
    Logger logger = Logger.getLogger(SecretProperties.class);

    private String life;

    public SecretProperties(String life) {
        logger.info("The secret of life is: " + life);
        this.life = life;
    }
}
