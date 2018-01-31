public final class Vehicle {
    private String name;
    private String size;
    private Long currentVelocity;
    private Long currentDirection;

    public Vehicle(String name, String size, Long currentVelocity, Long currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

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
