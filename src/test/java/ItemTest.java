import musicshop.Item;
import musicshop.instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    private Item drumsticks;

    @Before
    public void before() {
        drumsticks = new Item("drumsticks", 15.00, 20.00);
    }

    @Test
    public void hasDescription() {
        assertEquals("drumsticks", drumsticks.getDescription());
    }

    @Test
    public void hasPriceBought() {
        assertEquals(15.00, drumsticks.getPriceBought(), 0.0);
    }

    @Test
    public void hasPriceToSell() {
        assertEquals(20.00, drumsticks.getPriceToSell(), 0.0);
    }
    @Test
    public void canCalculateMarkup() {
        assertEquals(5.00, drumsticks.calculateMarkup(), 0.0);
    }


}
