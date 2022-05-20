import musicshop.instruments.Clarinet;
import musicshop.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    private Clarinet clarinet;
    private Clarinet clarinet2;

    @Before
    public void before(){
        Clarinet clarinet = new Clarinet("walnut", "brown", "Woodwind", 500.00, 750.00, 1);
    }
    @Test
    public void hasNumberOfReeds(){
        Clarinet clarinet2 = new Clarinet("ebony", "black", "Woodwind", 500.00, 750.00, 1);
        assertEquals(1, clarinet2.getNumberOfReeds());
    }
    @Test
    public void canPlay(){
        Clarinet clarinet2 = new Clarinet("ebony", "black", "Woodwind", 500.00, 750.00, 1);
        assertEquals("Huduhuhu", clarinet2.play());
    }
}
