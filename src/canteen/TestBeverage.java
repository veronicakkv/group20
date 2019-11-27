package testCMS;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import canteen.Beverage;
import canteen.Dish;

public class TestBeverage {
	
	@Test
	public void bev_getPrice1() {
		Beverage b = new Beverage("Carlsberg ofc", 49.95, 1);
		double price = b.getPrice();
		assertEquals(49.95, price, 0);
	}	
	
	@Test
	public void bev_getPrice2() {
		Beverage b = new Beverage("Carlsberg ofc", 0, 1);
		double price = b.getPrice();
		assertEquals(0, price, 0);
	}	
	
	@Test
	public void bev_negativePrice() {
		Throwable ex = assertThrows(IllegalArgumentException.class, () -> {
			new Beverage("Carlsberg ofc", -0.01, 1); 
		});
		assertEquals("Negative price", ex.getMessage());
	}	
	
	@Test
	public void bev_negativePrice1() {
		Throwable ex = assertThrows(IllegalArgumentException.class, () -> {
			new Beverage("Carlsberg ofc", -10.0, 1); 
		});
		assertEquals("Negative price", ex.getMessage());
	}	
	
	@Test
	public void bev_getID1() {
		Beverage b = new Beverage("Tuborg, danish again", 50.00, 2);
		int id = b.getID();
		assertEquals(2, id);
	}
}
