package models.enums;

/*
Explanation:
- we have commands in our login menu and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum LoginMenuCommands {
    ShowUserInfo("show\\s+user\\s+info"),
    ChangeCurrency("change-currency\\s+-n\\s+(?<newCurrency>.+?)"),
    ChangeUsername("change-username\\s+-n\\s+(?<newUsername>.+?)"),
    ChangePassword("change-password\\s+-o\\s+(?<oldPassword>.+?)\\s+-n\\s+(?<newPassword>.+?)"),
    BackToDashboard("back"),

    Login("login\\s+-u\\s+(?<username>.+?)\\s+-p\\s+(?<password>.+?)"),
    ForgetPassword("forget-password\\s+-u\\s+(?<username>.+?)\\s+-e\\s+(?<email>.+?)"),
    GoToSignUpMenu("go\\s+to\\s+signup\\s+menu")
    ;
    
    private final String command;

    LoginMenuCommands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}