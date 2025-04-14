package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Explanation:
- we have commands in our login menu and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum LoginMenuCommands implements Command {
    Login("login\\s+-u\\s+(?<username>.+?)\\s+-p\\s+(?<password>.+?)"),
    ForgetPassword("forget-password\\s+-u\\s+(?<username>.+?)\\s+-e\\s+(?<email>.+?)"),
    GoToSignUpMenu("go\\s+to\\s+signup\\s+menu")
    ;
    
    private final String command;

    LoginMenuCommands(String command) {
        this.command = command;
    }

    public Matcher getMatcher(String input) {
        return Pattern.compile(command).matcher(input);
    }
}