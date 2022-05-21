import musicshop.instruments.Guitar;
import musicshop.instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before(){guitar = new Guitar("plastic", "red", InstrumentType.STRING, 100.00, 150.95, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("plastic", guitar.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("red", guitar.getColour());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }
    @Test
    public void hasPriceBought(){
        assertEquals(100.00, guitar.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceToSell(){
        assertEquals(150.95, guitar.getPriceToSell(), 0.0);
    }
    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }
    @Test
    public void canPlay(){
        assertEquals("Strum Strum", guitar.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(50.95, guitar.calculateMarkup(), 0.05 );
    }
}
