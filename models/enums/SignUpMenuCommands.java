package models.enums;
/*
Explanation:
- we have commands in our sign-up menu and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum SignUpMenuCommands{
    Register("register\\s+-u\\s+(?<username>.+?)\\s+-p\\s+(?<password>.+?)\\s+-e\\s+(?<email>.+?)\\s+-n\\s+(?<name>.+?)"),
    GoToLoginMenu("go\\s+to\\s+login\\s+menu")
    ;
    private final String command;

    SignUpMenuCommands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
