import musicshop.Item;
import musicshop.Shop;
import musicshop.instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Item drumsticks;
    private Piano piano;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        drumsticks = new Item("drumsticks", 15.00, 20.00);
        piano = new Piano("ebony", "black", "Keyboard", 1000.00, 1500.00, 88);
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
}
