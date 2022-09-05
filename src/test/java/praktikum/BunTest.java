package praktikum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    Bun bun = new Bun("Космическая булка", 100);

    @Test
    public void getName() {
        String expectedName = "Космическая булка";
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPrice() {
        float expectedPrice = 100;
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice, actualPrice, 0);
    }
}
