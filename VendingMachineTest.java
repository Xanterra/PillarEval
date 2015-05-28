package com.pillar.eval;
import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

	@Test
	public void whenCoinsAreInsertedInsertCoinIsNotDisplayed() {
		VendingMachine vm1 = new VendingMachine();
		assertFalse(vm1.insert(2,2).equals("INSERT COIN"));
	}
	
	@Test
	public void whenCoinsAreNotInsertedInsertCoinIsDisplayed() {
		VendingMachine vm3 = new VendingMachine();
		assertEquals(vm3.insert(), "INSERT COIN");
	}
	
	@Test
	public void whenNickelIsInsertedValueIncreasesByFive() {
		VendingMachine vm2 = new VendingMachine();
		assertEquals("5", vm2.insert(2,2));
		assertEquals("10", vm2.insert(2,2));
	}
	@Test
	public void whenDimeIsInsertedValueIncreasesByTen() {
		VendingMachine vm4 = new VendingMachine();
		assertEquals("10", vm4.insert(2,1));
		assertEquals("20", vm4.insert(2,1));
	}
	
	@Test
	public void whenQuarterIsInsertedValueIncreasesBy25() {
		VendingMachine vm5 = new VendingMachine();
		assertEquals("25", vm5.insert(3,3));
		assertEquals("50", vm5.insert(3,3));
	}
	@Test
	public void whenPennyIsInsertedReturnsErrorMessage() {
		VendingMachine vm6 = new VendingMachine();
		assertEquals("INVALID COIN", vm6.insert(1,1));
	}

}
