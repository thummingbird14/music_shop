import musicshop.instruments.InstrumentType;
import musicshop.instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS, 450.00, 700.00, 3);
    }
    @Test
    public void hasMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }
    @Test
    public void hasColour(){
        assertEquals("gold", trumpet.getColour());
    }
    @Test
    public void hasType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }
    @Test
    public void hasPriceBought(){
        assertEquals(450.00, trumpet.getPriceBought(), 0.0);
    }
    @Test
    public void hasPriceToSell(){
        assertEquals(700.00, trumpet.getPriceToSell(), 0.0);
    }
    @Test
    public void hasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }
    @Test
    public void canPlay(){
        assertEquals("Buuup", trumpet.play());
    }
    @Test
    public void canCalculateMarkup(){
        assertEquals(250.00, trumpet.calculateMarkup(), 0.0);
    }
}
