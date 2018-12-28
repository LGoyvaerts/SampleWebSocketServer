package ch.ti8m.apprentice.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ch.ti8m.apprentice.websocket")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
