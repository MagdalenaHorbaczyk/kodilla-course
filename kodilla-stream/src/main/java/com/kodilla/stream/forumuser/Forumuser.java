package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class Forumuser {
    private final int userId;
    private final String userName;
    private final char userSex;
    private final LocalDate birthDate;
    private final int postQty;

    public Forumuser(int userId, String userName, char userSex, LocalDate birthDate, int postQty) {
        this.userId = userId;
        this.userName = userName;
        this.userSex = userSex;
        this.birthDate = birthDate;
        this.postQty = postQty;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQty() {
        return postQty;
    }

    @Override
    public String toString() {
        return "Forumuser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userSex=" + userSex +
                ", birthDate=" + birthDate +
                ", postQty=" + postQty +
                '}';
    }
}
