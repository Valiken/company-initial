package io.rscale.training.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class MessageController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    @Profile("cloud")
    String getMessage() {
        return "\n" + this.message + "\n\n";
    }
}
