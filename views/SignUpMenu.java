package views;

import controllers.SignUpMenuController;
import models.Result;
import models.enums.SignUpMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class SignUpMenu implements AppMenu {
    SignUpMenuController controller = new SignUpMenuController();
    private static Result result;

    public static Result getResult() {
        return result;
    }

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine().trim();
        Matcher matcher;
        if ((matcher = SignUpMenuCommands.Register.getMatcher(command)).find()) {
            result = controller.register(matcher.group("username"), matcher.group("password")
                                , matcher.group("email"), matcher.group("name"));
        } else if ((matcher = SignUpMenuCommands.GoToLoginMenu.getMatcher(command)).find()) {
            controller.goToLoginMenu();
        }
    }
}
