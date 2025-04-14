package views;

import controllers.LoginMenuController;
import models.Result;
import models.enums.LoginMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu implements AppMenu  {
    LoginMenuController controller = new LoginMenuController();

    private static Result result;

    public static Result getResult() {
        return result;
    }

    public static void setResult(Result result) {
        LoginMenu.result = result;
    }

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine().trim();
        Matcher matcher;
        if ((matcher = LoginMenuCommands.Login.getMatcher(command)).find()) {
            setResult(controller.Login(matcher.group("username"), matcher.group("password")));
        } else if ((matcher = LoginMenuCommands.ForgetPassword.getMatcher(command)).find()) {
            setResult(controller.ForgetPassword(matcher.group("username"), matcher.group("password")));
        } else if ((matcher = LoginMenuCommands.GoToSignUpMenu.getMatcher(command)).find()) {
            setResult(controller.GoToSignUpMenu());
        }
    }
}
