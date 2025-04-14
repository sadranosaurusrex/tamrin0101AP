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
    private String groupType;
    private String name;
    private User creator;
    public final ArrayList<User> users = new ArrayList<>();
    private long id;

    public long getId() {
        return id;
    }

    public void addUsers(User user) {
        this.users.add(user);
    }

    public void setId(long id) {
        this.id = id;
    }

    public Group(String groupType, String name, User creator, int id) {
        this.groupType = groupType;
        this.name = name;
        this.creator = creator;
        this.id = id;
        this.users.add(creator);
    }

    public String showGroupInfo() {
        String message =
                "group name : " + this.name +
                "\nid : " + this.id +
                "\ntype : " + this.groupType +
                "\ncreator : " + this.creator +
                "\nmembers :";
        for (User user : this.users) {
            message += "\n" + user.name;
        }
        message += "\n--------------------";

        return message;
    }


}
