package uz.eskiz.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "eskiz")
public class EskizProperties {
    private Boolean simulate;
    private String email;
    private String password;
    private String senderName;
    private String callbackUrl;
}