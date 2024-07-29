package com.crazy.myspringboot.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;

/**
 * @author lizhiqiang
 */
public class WebSocketController extends TextWebSocketHandler {

    @Override
    public void handleTextMessage(WebSocketSession webSocketSession, TextMessage textMessage) throws IOException {
        webSocketSession.sendMessage(new TextMessage("ok".getBytes()));

        System.out.println("test");
    }

}
