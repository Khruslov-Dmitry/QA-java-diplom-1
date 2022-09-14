package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    IngredientType type;

    Ingredient mayo = new Ingredient(type.SAUCE, "майонез", 10);
    Ingredient cutlet = new Ingredient(type.FILLING, "котлета", 100);

    @Test
    public void getPrice() {
        float expectedPrice = 100;
        float actualPrice = cutlet.getPrice();
        assertEquals(expectedPrice, actualPrice, 0);
    }

    @Test
    public void getName() {
        String expectedName = "котлета";
        String actualName = cutlet.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getType() {
        String expected = type.SAUCE.toString();
        String actual = mayo.getType().toString();
        assertEquals(expected, actual);
    }
}