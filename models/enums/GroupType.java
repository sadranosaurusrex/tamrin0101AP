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

    GroupType() {
        this.displayName = this.name(); // Default to enum name if no parameter
    }

    public String getDisplayName() {
        return displayName;
    }
}