public final class Vehicle {
    private String Name;
    private String Size;

    public String getName() {
        return "ZZZ";
    }

    public String getSize() {
        return "4WD";
    }

    public Long getCurrentVelocity() {
        return 0L;
    }

    public Long getCurrentDirection() {
        return 0L;
    }

    //Method to add direction to the current direction
    void steer(int direction) {
    }

    //Method to set velocity to currentVelocity and direction to currentDirection.
    void move(int velocity, int direction) {
    }

    //Method to change the currentVelocity to zero
    void stop() {
    }
}
