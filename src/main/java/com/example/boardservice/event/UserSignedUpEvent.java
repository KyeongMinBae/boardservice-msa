package com.example.boardservice.event;

import tools.jackson.databind.ObjectMapper;

public class UserSignedUpEvent {
    private Long userId;
    private String name;

    public UserSignedUpEvent() {
    }

    public static UserSignedUpEvent fromJson(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(json, UserSignedUpEvent.class);
    }

    public Long getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
