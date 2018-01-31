import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class VehicleTest {

    private final String testName = new String("Outlander");
    private final String testSize = new String("4WD");
    private final Long testVelocity = new Long(0L);
    private final Long testDirection = new Long(0L);


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
        assertThat(v.getCurrentVelocity(), is(0L));
    }

    @Test
    public void ShouldGetCurrentDirection() throws Exception {
        final Vehicle v = new Vehicle(testName, testSize, testVelocity, testDirection);
        assertThat(v.getCurrentDirection(), is(0L));
    }
}