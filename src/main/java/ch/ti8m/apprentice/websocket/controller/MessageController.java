package ch.ti8m.apprentice.websocket.controller;

import ch.ti8m.apprentice.websocket.model.OutputMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public OutputMessage outputMessage(String message) throws Exception {
//        Thread.sleep(1000);
        log.info("Received message from: " + message);
        return new OutputMessage("Hello, " + message + "!");
    }
}
