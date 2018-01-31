import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class VehicleTest {

    private final String testName = new String("Outlander");
    private final String testSize = new String("4WD");
    private final Integer testVelocity = new Integer(0);
    private final Integer testDirection = new Integer(0);


    @Test
    public void ShouldGetName() throws Exception {
        final Vehicle v = new Vehicle(testName, testSize, testVelocity, testDirection);
        assertThat(v.getName(), is(testName));
    }

    @Test
    public void ShouldGetSize() throws Exception {
        final Vehicle v = new Vehicle(testName, testSize, testVelocity, testDirection);
        assertThat(v.getSize(), is("4WD"));
    }

    @Test
    public void ShouldGetCurrentVelocity() throws Exception {
        final Vehicle v = new Vehicle(testName, testSize, testVelocity, testDirection);
        assertThat(v.getCurrentVelocity(), is(0));
    }

    @Test
    public void ShouldGetCurrentDirection() throws Exception {
        final Vehicle v = new Vehicle(testName, testSize, testVelocity, testDirection);
        assertThat(v.getCurrentDirection(), is(0));
    }

    @Test
    public void ShouldChangeVelocity() throws Exception {
        final Integer startVelocity = new Integer(0);
        final Integer endVelocity = new Integer(5);

        final Vehicle v = new Vehicle(testName, testSize, startVelocity, testDirection);
        v.move(5, 0);
        assertThat(v.getCurrentVelocity(), is(5));
    }

    @Test
    public void ShouldChangeDirection() throws Exception {
        final Integer startVelocity = new Integer(0);
        final Integer endVelocity = new Integer(9);
        final Integer startDirection = new Integer(0);
        final Integer endDirection = new Integer(10);

        final Vehicle v = new Vehicle(testName, testSize, startVelocity, startDirection);
        v.move(endVelocity, endDirection);
        assertThat(v.getCurrentVelocity(), is(endVelocity));
        assertThat(v.getCurrentVelocity(), is(endDirection));
    }
}