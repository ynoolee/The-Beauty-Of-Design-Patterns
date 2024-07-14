package ch08.state;

public enum State {
    SMALL(0),
    SUPER(1),
    FIRE(2),
    CAPE(3),
    ;

    private int value;

    State(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
