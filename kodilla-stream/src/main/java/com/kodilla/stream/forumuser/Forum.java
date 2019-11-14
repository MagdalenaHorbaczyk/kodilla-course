package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<Forumuser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new Forumuser(1, "Ann",
                'F', LocalDate.of(2000, 9, 8), 20));
        theUserList.add(new Forumuser(2, "Ryan",
                'M', LocalDate.of(1982, 8, 23), 500));
        theUserList.add(new Forumuser(3, "Madelynn",
                'F', LocalDate.of(2005, 5, 6), 245));
        theUserList.add(new Forumuser(4, "Giancarlo",
                'M', LocalDate.of(1967, 1, 13), 576));
        theUserList.add(new Forumuser(5, "Aimee",
                'F', LocalDate.of(2003, 2, 3), 5));
        theUserList.add(new Forumuser(7, "Dylan",
                'M', LocalDate.of(1996, 12, 1), 0));
    }

    public List<Forumuser> getList() {
        return new ArrayList<>(theUserList);
    }
}
