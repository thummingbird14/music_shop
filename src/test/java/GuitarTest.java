import musicshop.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;
    private Guitar guitar2;

    @Before
    public void before(){
        Guitar guitar = new Guitar("plastic", "red", "String", 100.00, 150.95, 6);
    }

    @Test
    public void hasMaterial(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals("plastic", guitar2.getMaterial());
    }
    @Test
    public void hasColour(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals("blue", guitar2.getColour());
    }
    @Test
    public void hasType(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals("String", guitar2.getType());
    }
    @Test
    public void hasPriceBought(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals(100.00, guitar2.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceToSell(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals(150.95, guitar2.getPriceToSell(), 0.0);
    }
    @Test
    public void hasNumberOfStrings(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals(6, guitar2.getNumberOfStrings());
    }
    @Test
    public void canPlay(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals("Strum Strum", guitar2.play());
    }
    @Test
    public void canCalculateMarkup(){
        Guitar guitar2 = new Guitar("plastic", "blue", "String", 100.00, 150.95, 6);
        assertEquals(50.95, guitar2.calculateMarkup(), 0.05 );
    }
}
