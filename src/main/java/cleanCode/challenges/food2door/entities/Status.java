package cleanCode.challenges.food2door.entities;

public enum Status {

    CREATED("CREATED"),
    SENT("SENT"),
    PAID("PAID"),
    RECEIVED("RECEIVED");

    private String description;

    Status(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
