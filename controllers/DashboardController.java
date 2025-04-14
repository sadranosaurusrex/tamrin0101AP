package controllers;

import models.Group;
import models.Result;
import models.App;
import models.User;

public class DashboardController {
    public Result createGroup(String name, String type) {
        if (!validGroupName(name)) {
            return new Result(false, "group name format is invalid!");
        } else if (!validGroupType(type)) {
            return new Result(false, "group type is invalid!");
        }

        Group group = new Group(type, name, App.getCurrentUser(), App.groups.size());
        App.groups.add(group);
        return new Result(true, "group created successfully!");
    }

    private boolean validGroupType(String type) {
        if (type.equals("Home") || type.equals("Trip") || type.equals("Zan-o-Bache") || type.equals("Other ")) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean validGroupName(String name) {
        return name != null &&
                name.matches("^(?=.{4,30}$)[a-zA-Z0-9 !@#$%^&*]+$");
    }

    public Result showMyGroups() {
        StringBuilder message = new StringBuilder();
        for (Group group : App.getCurrentUser().groups) {
            message.append("\n").append(group.showGroupInfo());
        }
        return new Result(true, "" + message);
    }


    public Result addUser(String username, String email, String groupId) {
        int id = Integer.parseInt(groupId);
        for (User user : App.users) {
            if (user.getUsername().equals(username)) {
                break;
            }
            if (user.equals(App.users.getLast())) {
                return new Result(false, "user not found!");
            }
        }
        if (App.groups.get(id -1) == null) {
            return new Result(false, "group not found!");
        }
        for (User user : App.groups.get(id -1).users) {
            if (user.getUsername().equals(username)) {
                return new Result(false, "user already in the group!");
            }
        }
        return new Result(true, "user added to the group successfully!");
    }
}