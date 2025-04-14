package views;

import controllers.DashboardController;
import models.App;
import models.Result;
import models.enums.DashboardCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Dashboard implements AppMenu {
    DashboardController controller = new DashboardController();
    private static Result result;

    public static Result getResult() {
        return result;
    }

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine().trim();
        Matcher matcher;

        if ((matcher = DashboardCommands.CreateGroup.getMatcher(command)).find()) {
            result = controller.createGroup(matcher.group("type"), matcher.group("name"));
        } else if ((matcher = DashboardCommands.ShowMyGroups.getMatcher(command)).find()) {
            result = controller.showMyGroups();
        } else if ((matcher = DashboardCommands.AddUser.getMatcher(command)).find()) {
            result = controller.addUser(
                    matcher.group("username"),
                    matcher.group("email"),
                    matcher.group("groupId")
            );
        } else if ((matcher = DashboardCommands.AddExpenseEqually.getMatcher(command)).find()) {
            result = controller.addExpenseEqually(
                    matcher.group("groupId"),
                    Double.parseDouble(matcher.group("totalExpense")),
                    Integer.parseInt(matcher.group("numUsers")),
                    matcher.group("userList").split("\\s+")
            );
        } else if ((matcher = DashboardCommands.AddExpenseUnequally.getMatcher(command)).find()) {
            result = controller.addExpenseUnequally(
                    matcher.group("groupId"),
                    Double.parseDouble(matcher.group("totalExpense")),
                    Integer.parseInt(matcher.group("numUsers")),
                    matcher.group("expenseDetails").split("\\s+")
            );
        } else if ((matcher = DashboardCommands.ShowBalance.getMatcher(command)).find()) {
            result = controller.showBalance(
                    matcher.group("username")
            );
        } else if ((matcher = DashboardCommands.SettleUp.getMatcher(command)).find()) {
            result = controller.settleUp(
                    matcher.group("username"),
                    Double.parseDouble(matcher.group("inputMoney"))
            );
        } else if ((matcher = DashboardCommands.GoToProfileMenu.getMatcher(command)).find()) {
            controller.goToProfileMenu();
        } else if ((matcher = DashboardCommands.LogOut.getMatcher(command)).find()) {
            controller.logOut();
        } else {
            result = new Result(false, "Invalid command!");
        }
    }
}