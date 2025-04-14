package models.enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Explanation:
- we have commands in our dashboard and this commands need regexes to be checked.
- put those regexes here and use them in your code.
- this regexes need some functions, put those functions in here.
 */
public enum DashboardCommands implements Command {
    CreateGroup("create-group\\s+-n\\s+(?<name>.+?)\\s+-t\\s+(?<type>.+?)"),
    ShowMyGroups("show\\s+my\\s+groups"),
    AddUser("add-user\\s+-u\\s+(?<username>.+?)\\s+-e\\s+(?<email>.+?)\\s+-g\\s+(?<groupId>.+?)"),
    AddExpenseEqually("add-expense\\s+-g\\s+(?<groupId>.+?)\\s+-s\\s+equally\\s+-t\\s+(?<totalExpense>.+?)\\s+-n\\s+(?<numUsers>.+?)\\s+(?<userList>([\\w\\d]+\\s*)+)"),
    AddExpenseUnequally("add-expense\\s+-g\\s+(?<groupId>.+?)\\s+-s\\s+unequally\\s+-t\\s+(?<totalExpense>.+?)\\s+-n\\s+(?<numUsers>.+?)\\s+(?<expenseDetails>([\\w\\d]+\\s+[\\d]+)(?:\\s+[\\w\\d]+\\s+[\\d]+)*)"),
    ShowBalance("show\\s+balance\\s+-u\\s+(?<username>.+?)"),
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

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(command).matcher(input);
    }
}
