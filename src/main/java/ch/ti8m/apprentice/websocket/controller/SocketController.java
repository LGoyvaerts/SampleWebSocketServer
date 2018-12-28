package ch.ti8m.apprentice.websocket.controller;

import ch.ti8m.apprentice.websocket.model.EchoModel;
import ch.ti8m.apprentice.websocket.service.SocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocketController {

    @Autowired
    private SocketService socketService;

    @MessageMapping("/hello-msg-mapping")
    @SendTo("/topic/greetings")
    EchoModel echoMessageMapping(String message) {
        return new EchoModel(message.trim());
    }

    @RequestMapping(value = "/hello-convert-and-send", method = RequestMethod.POST)
    void echoConvertAndSend(@RequestParam("msg") String message) {
        socketService.echoMessage(message);
    }


}
