package ch.ti8m.apprentice.websocket.service;

import ch.ti8m.apprentice.websocket.model.EchoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SocketService {

    @Autowired
    private SimpMessagingTemplate simpTemplate;

    public void echoMessage(String message) {
        simpTemplate.convertAndSend("/topic/greetings", new EchoModel(message));

    }
}
