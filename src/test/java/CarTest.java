import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public final class CarTest {

    @Test
    public void shouldCreateEmptyCar() throws Exception {
        final Car c = new Car();

        assertThat(c.getCurrentDirection(), is(0));
        assertThat(c.getCurrentVelocity(), is(0));
        assertThat(c.getName(), is(""));
        assertThat(c.getSize(), is(""));
    }
}