package controllers;
/*
Explanation:
- This is a controller class for the sign-up menu Controller.
- This class will be used to implement functions that do sign up menu operations.
- notice that this class should not have any input and output and just use it to implement functionalities.
 */

import models.Result;
import models.User;
import models.App;
import models.enums.Menu;

import java.util.ArrayList;

public class SignUpMenuController {
    public Result register(String username, String password, String email, String name) {
        if (!validUsername(username)) {
            return new Result(false, "username format is invalid!");
        } else if (!isUsernameNew(username)) {
            return new Result(false, "this username is already taken!");
        } else if (!validPassword(password)) {
            return new Result(false, "password format is invalid!");
        } else if (!validEmail(email)) {
            return new Result(false, "email format is invalid!");
        } else if (!validName(name)) {
            return new Result(false, "name format is invalid!");
        }

        User newUser = new User(username, password, email, name,null);

        App.addUser(newUser);
        return new Result(true,"user registered successfully.you are now in login menu!");
    }

    public Result goToLoginMenu() {
        App.setCurrentMenu(Menu.LoginMenu);
        return new Result(true,"you are now in login menu!");
    }


    public boolean validUsername(String username) {
        return username != null &&
                username.matches("^[a-zA-Z][a-zA-Z0-9-_.]{3,9}$");
    }

    public boolean isUsernameNew(String username) {
        for (User user : App.users ) {
            if (user.getUsername().equals(username)) {
                return false;
            }
        }
        return true;
    }

    public boolean validPassword(String password) {
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{6,12}$";

        return password.matches(passwordRegex);
    }

    public boolean validEmail(String email) {
        if (email == null) {
            return false;
        }

        String emailRegex = "^([a-zA-Z][a-zA-Z0-9-_.]{3,9})@([a-z]+([-.][a-z]+)*)\\.(com|org|net|edu)$";

        if (!email.matches(emailRegex)) {
            return false;
        }

        String domain = email.split("@")[1].split("\\.")[0];
        if (domain.length() < 3 || domain.length() > 7) {
            return false;
        }
        if (domain.matches(".*[-.]{2,}.*")) {
            return false;
        }

        return true;
    }

    public boolean validName(String name) {
        return name != null &&
                name.matches("^[a-zA-Z]+(?:-[a-zA-Z]+)*$") &&
                !name.startsWith("-") &&
                !name.endsWith("-");
    }
}
