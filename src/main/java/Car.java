//import lombok.Getter;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public final class Car extends Vehicle {
    private Integer wheels;
    private Integer doors;
    private Integer gears;
    private Boolean isManual;


    public Car(Integer wheels, Integer doors, Integer gears, Boolean isManual) {
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
    }
}
