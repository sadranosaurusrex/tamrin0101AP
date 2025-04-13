package models;

import models.enums.Menu;

import java.util.ArrayList;

/*
Explanation:
- In out app, we need somewhere to keep our general data like list of users and list of groups and logged-in user etc.
- This class is the place for that.
- Put your general data here and use them in your code.
- you should put some functions here to manage your data too.
 */
public class App {
    ArrayList<Expense> expenses;
    ArrayList<Group> groups;
    ArrayList<User> users;
    private static Menu currentMenu = Menu.SignupMenu;

    public App() {
        users = new ArrayList<>();
        groups = new ArrayList<>();
        expenses = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }
}
