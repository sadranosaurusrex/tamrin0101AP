package models.enums;

import views.*;

import java.util.regex.Matcher;

public enum Menu implements Command{
    SignupMenu(new SignUpMenu()),
    LoginMenu(new LoginMenu()),
    ExitMenu(new ExitMenu()),
    DashBoard(new Dashboard()),
    ProfileMenu(new ProfileMenu());

    private final AppMenu menu;

    Menu(AppMenu menu) {
        this.menu = menu;
    }

    public AppMenu getMenu() {
        return menu;
    }

    @Override
    public Matcher getMatcher(String input) {
        return null;
    }
}
