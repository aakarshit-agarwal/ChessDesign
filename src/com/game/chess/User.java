package com.game.chess;

import java.util.UUID;

public abstract class User {
    String id;
    String name;
    String email;
    String phone;

    User(final String name, final String email, final String phone) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
}