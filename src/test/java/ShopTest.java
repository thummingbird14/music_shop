import musicshop.Item;
import musicshop.Shop;
import musicshop.instruments.Guitar;
import musicshop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Item drumsticks;
    private Piano piano;
    private Guitar guitar;
    private Item sheetmusic;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        drumsticks = new Item("drumsticks", 15.00, 20.00);
        piano = new Piano("ebony", "black", "Keyboard", 1000.00, 1500.00, 88);
        guitar = new Guitar("plastic", "silver", "String", 200.00, 250.00, 4);
        sheetmusic = new Item("sheetmusic", 5.00, 10.00);
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", shop.getName());
    }

    @Test
    public void stockBeginsEmpty() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(drumsticks);
        shop.addToStock(piano);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(drumsticks);
        shop.addToStock(piano);
        shop.removeFromStock(drumsticks);
        shop.removeFromStock(piano);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculateProfit() {
        shop.addToStock(drumsticks);
        shop.addToStock(piano);
        shop.addToStock(guitar);
        shop.addToStock(sheetmusic);
        assertEquals(560, shop.calculateProfit(), 0.0);
    }
}
