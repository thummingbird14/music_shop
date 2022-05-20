import musicshop.instruments.Guitar;
import musicshop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;
    private Piano piano2;

    @Before
    public void before(){
        Piano piano = new Piano("ivory", "white", "Keyboard", 800.00, 1200.00, 88);
    }
    @Test
    public void hasNumberOfKeys(){
        Piano piano2 = new Piano("ebony", "black", "Keyboard", 800.00, 1200.00, 88);
        assertEquals(88, piano2.getNumberOfKeys());
    }
    @Test
    public void canPlay(){
        Piano piano2 = new Piano("ebony", "black", "Keyboard", 800.00, 1200.00, 88);
        assertEquals("Plink Plonk", piano2.play());
    }
    @Test
    public void canCalculateMarkup(){
        Piano piano2 = new Piano("ebony", "black", "Keyboard", 800.00, 1200.00, 88);
        assertEquals(400.00, piano2.calculateMarkup(), 0.0);
    }
}
