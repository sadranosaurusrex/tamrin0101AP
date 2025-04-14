package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Explanation:
- we have commands in our sign-up menu and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum SignUpMenuCommands implements Command {
    Register("register\\s+-u\\s+(?<username>\\w+)\\s+-p\\s+(?<password>\\S+)\\s+-e\\s+(?<email>\\S+@\\S+)\\s+-n\\s+(?<name>.+?)"),
    GoToLoginMenu("go\\s+to\\s+login\\s+menu");

    //

    private final String command;

    SignUpMenuCommands(String command) {
        this.command = command;
    }

    public Matcher getMatcher(String input) {
        return Pattern.compile(command).matcher(input);
    }
}
