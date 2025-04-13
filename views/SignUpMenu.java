package views;

import controllers.SignUpMenuController;
import models.enums.SignUpMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class SignUpMenu implements AppMenu {
    SignUpMenuController controller = new SignUpMenuController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;
        if ((matcher = SignUpMenuCommands.Register.getMatcher(command)).find()) {
            controller.register(matcher.group("username"), matcher.group("password"));
        } else if (SignUpMenuCommands.GoToLoginMenu.getMatcher(command).find()) {
//            controller
        }
    }
}
