import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class VehicleTest {

    private final String name = new String("ZZZ");


    @Test
    public void ShouldGetName() throws Exception {
        final Vehicle v = new Vehicle();
        assertThat(v.getName(), is(name));
    }

    @Test
    public void ShouldGetSize() throws Exception {
        final Vehicle v = new Vehicle();
        assertThat(v.getSize(), is("4WD"));
    }

    @Test
    public void ShouldGetCurrentVelocity() throws Exception {
        final Vehicle v = new Vehicle();
        assertThat(v.getCurrentVelocity(), is(0L));

    }
}