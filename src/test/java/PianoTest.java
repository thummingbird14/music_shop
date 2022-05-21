import musicshop.instruments.Guitar;
import musicshop.instruments.InstrumentType;
import musicshop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before(){ piano = new Piano("ivory", "white", InstrumentType.KEYBOARD, 800.00, 1200.00, 88);
    }
    @Test
    public void hasMaterial(){
        assertEquals("ivory", piano.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("white", piano.getColour());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }
    @Test
    public void hasPriceBought(){
        assertEquals(800.00, piano.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceToSell(){
        assertEquals(1200.00, piano.getPriceToSell(), 0.0);
    }
    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }
    @Test
    public void canPlay(){
        assertEquals("Plink Plonk", piano.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(400.00, piano.calculateMarkup(), 0.0);
    }
}
