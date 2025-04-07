package models.enums;

/*
Explanation:
- Enum representing commands available in the profile menu.
*/

public enum ProfileMenuCommands {
    ShowUserInfo("show\\s+user\\s+info"),
    ChangeCurrency("change-currency\\s+-n\\s+(?<currency>.+?)"),
    ChangeUsername("change-username\\s+-n\\s+(?<newUsername>.+?)"),
    ChangePassword("change-password\\s+-o\\s+(?<oldPassword>.+?)\\s+-n\\s+(?<newPassword>.+?)");

    private final String command;

    ProfileMenuCommands(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
