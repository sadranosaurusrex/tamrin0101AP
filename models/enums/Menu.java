package models.enums;

import views.*;

public enum Menu {
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
}
