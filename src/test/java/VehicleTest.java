import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class VehicleTest {

    private final String name = new String("ZZZ");

    @Test
    public void ShouldGetName() throws Exception {
        Vehicle v = new Vehicle();
        v.getName();
        assertThat(v.getName(), is(name));
    }
}