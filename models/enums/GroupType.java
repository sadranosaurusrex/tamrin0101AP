package models.enums;

public enum GroupType {
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
}