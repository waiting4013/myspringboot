package com.crazy.myspringboot.websocket;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * ws
 * @author lizhiqiang
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {


    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(jobxWebSocketGetJobInstanceGroupInfoHandler(), "/ws/get").setAllowedOrigins("*");
    }


    @Bean
    public WebSocketHandler jobxWebSocketGetJobInstanceGroupInfoHandler() {
        return new WebSocketController();
    }
}

