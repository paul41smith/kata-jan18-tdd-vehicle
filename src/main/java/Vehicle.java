public final class Vehicle {
    private String name;
    private String size;
    private Integer currentVelocity;
    private Integer currentDirection;

    public Vehicle(String name, String size, Integer currentVelocity, Integer currentDirection) {
        this.name = name;
        this.size = size;
        this.currentVelocity = currentVelocity;
        this.currentDirection = currentDirection;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public Integer getCurrentVelocity() {
        return currentVelocity;
    }

    public Integer getCurrentDirection() {
        return currentDirection;
    }

    //Method to add direction to the current direction
    void steer(Integer direction) {
        this.currentDirection += direction;
    }

    //Method to set velocity to currentVelocity and direction to currentDirection.
    void move(Integer velocity, Integer direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
    }

    //Method to change the currentVelocity to zero
    void stop() {
        this.currentDirection = 0;
        this.currentVelocity = 0;
    }
}
