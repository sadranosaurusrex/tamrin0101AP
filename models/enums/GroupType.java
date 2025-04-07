package models.enums;

public enum GroupType {
    Home ("Home"),
    Trip ("Trip"),
    Zan_o_bache("Zan_o_bache"),
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