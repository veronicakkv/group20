package testCMS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import canteen.Dish;

public class TestDish {
	
	@Test
	public void dish_getPrice1() {
		Dish d1 = new Dish("Noodles", 19.95, 1);
		double price = d1.getPrice();
		assertEquals(19.95, price, 0);
	}
	
	@Test
	public void dish_getPrice2() {
		Dish d1 = new Dish("Noodles", 0, 1);
		double price = d1.getPrice();
		assertEquals(0, price, 0);
	}
	
	@Test
	public void dish_negativePrice3() {
		Throwable ex = assertThrows(IllegalArgumentException.class, () -> {
			new Dish("Noodles", -0.01, 1); 
		});
		assertEquals("Negative price", ex.getMessage());
	}
	
	@Test
	public void dish_negativePrice4() {
		Throwable ex = assertThrows(IllegalArgumentException.class, () -> {
			new Dish("Noodles", -10.0, 1); 
		});
		assertEquals("Negative price", ex.getMessage());
	}
	
	@Test
	public void dish_getID1() {
		Dish d = new Dish("Fish", 1.00, 2);
		int id = d.getID();
		assertEquals(2, id);
	}
	

}