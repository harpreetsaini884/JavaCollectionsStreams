package org.rituraj.annotations.intermediate.maxlength;

class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if (username.length() > 10) {
            throw new IllegalArgumentException("Username exceeds max length");
        }
        this.username = username;
    }
}
