package models.enums;

import java.util.regex.Matcher;

public enum GroupType implements Command{
    Home ("Home"),
    Trip ("Trip"),
    Family("Zan-o-Bache"),
    Other("Other");

    private final String displayName;

    GroupType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public Matcher getMatcher(String input) {
        return null;
    }
}