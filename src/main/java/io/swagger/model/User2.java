package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public class User2 extends Users{
    private static final long serialVersionUID = 1L;

    @JsonValue
    public List<User> getUser() {
        return users;
    }
}
