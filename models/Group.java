package models;
/*
Explanation:
- In our app, we have groups that have some information.
- Group is something that we need to make it an object because it looks like an object (:
- put those information here and use them in your code.
 */

import models.enums.GroupType;

import java.util.ArrayList;

public class Group {
    private GroupType groupType;
    private String name;
    private User creator;
    private ArrayList<User> users;
    private long id;

    public void addUsers(User user) {
        this.users.add(user);
    }

    public void setId(long id) {
        this.id = id;
    }

    Group(GroupType groupType, String name, User creator, int id) {
        this.groupType = groupType;
        this.name = name;
        this.creator = creator;
        this.id = id;
        this.users = new ArrayList<>();
        this.users.add(creator);
    }


}
