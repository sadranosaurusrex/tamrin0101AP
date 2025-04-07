package models.enums;
/*
Explanation:
- we have commands in our dashboard and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum DashboardCommands  {
    CreateGroup("create-group\\s+-n\\s+(?<name>.+?)\\s+-t\\s+(?<type>.+?)"),
    AddExpense("add-expense\\s+-g\\s+(?<groupID>.+?)\\s+-e\\s+(?<equality>.+?)\\s+-t\\s+(?<totalExpense>.+?)\\s+-n\\s+(?<name>.+?)"),
    //There might be some conditions for expense adding that are not considered yet
    ShowBalance("show\\s+balance\\s+-u\\s+(?<username.+?>)"),
    SettleUp("settle-up\\s+-u\\s+(?<username>.+?)\\s+-m\\s+(?<inputMoney>.+?)"),
    GoToProfileMenu("go\\s+to\\s+profile\\s+menu"),
    LogOut("log\\s+out")
    ;


    private final String command;

    DashboardCommands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
