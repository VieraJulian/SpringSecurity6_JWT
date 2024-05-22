package com.app.app.controller.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.aspectj.bridge.IMessage;

@JsonPropertyOrder({"username", "message", "jwt", "status"})
public record AuthResponse (String username,
                            String message,
                            String jwt,
                            boolean status){

}
