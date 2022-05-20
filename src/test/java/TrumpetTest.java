import musicshop.instruments.Piano;
import musicshop.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;
    private Trumpet trumpet2;

    @Before
    public void before(){
        Trumpet  trumpet = new Trumpet("brass", "gold", "Brass", 450.00, 700.00, 3);
    }
    @Test
    public void hasNumberOfValves(){
        Trumpet trumpet2 = new Trumpet("brass", "gold", "Brass", 800.00, 1200.00, 4);
        assertEquals(4, trumpet2.getNumberOfValves());
    }
    @Test
    public void canPlay(){
        Trumpet trumpet2 = new Trumpet("brass", "gold", "Brass", 800.00, 1200.00, 4);
        assertEquals("Buuup", trumpet2.play());
    }
}
