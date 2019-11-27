package testCMS;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import canteen.Dish;
import canteen.Item;
import canteen.Menu;

public class TestMenu {
	
	@Test
	public void menu_zeroLength() {
		ArrayList<Item> someList = new ArrayList<Item>();
		Menu m = new Menu(someList);
		Item[] items = m.getItems();
		int length = items.length;
		assertEquals(0, length);
	}
	
	@Test
	public void menu_addAfter1() {
		Dish d = new Dish("Chicken", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		Menu m = new Menu(someList);
		m.addItem(d);
		Item[] items = m.getItems();
		int length = items.length;
		assertEquals(1, length);
	}
	
	@Test
	public void menu_addBefore1() {
		Dish d = new Dish("Chicken", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		someList.add(d);
		Menu m = new Menu(someList);
		Item[] items = m.getItems();
		int length = items.length;
		assertEquals(1, length);
	}
	
	@Test
	public void menu_addBefore3() {
		Dish d = new Dish("Chicken", 10.00, 1);
		Dish d1 = new Dish("Human", 10.00, 1);
		Dish d2 = new Dish("Human leg", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		someList.add(d);
		someList.add(d1);
		someList.add(d2);
		Menu m = new Menu(someList);
		Item[] items = m.getItems();
		int length = items.length;
		assertEquals(3, length);
	}

	@Test
	public void menu_addBeforeRemove() {
		Dish d = new Dish("Chicken", 10.00, 1);
		Dish d1 = new Dish("Human", 10.00, 1);
		Dish d2 = new Dish("Human leg", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		someList.add(d);
		someList.add(d1);
		someList.add(d2);
		Menu m = new Menu(someList);
		m.removeItem(d);
		Item[] items = m.getItems();
		int length = items.length;
		assertEquals(2, length);
	}
	
	@Test
	public void menu_remove1() {
		Dish d = new Dish("Chicken", 10.00, 1);
		Dish d1 = new Dish("Human", 10.00, 1);
		Dish d2 = new Dish("Human leg", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		Menu m = new Menu(someList);
		m.addItem(d);
		m.addItem(d1);
		m.addItem(d2);
		assertEquals(3, m.getItems().length);
		m.removeItem(d1);
		assertEquals(2, m.getItems().length);
	}
	
	@Test
	public void menu_removeEmpty() {
		Dish d = new Dish("Chicken", 10.00, 1);
		ArrayList<Item> someList = new ArrayList<Item>();
		Menu m = new Menu(someList);
		m.removeItem(d);
		assertEquals(0, m.getItems().length);
	}
}
