package com.pillar.eval;
import org.junit.Test;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {

	@Test
	public void whenCoinsAreInsertedInsertCoinIsNotDisplayed() {
		VendingMachine vm1 = new VendingMachine();
		assertFalse(vm1.insert(1,1).equals("INSERT COIN"));
	}
	
	@Test
	public void whenCoinsAreNotInsertedInsertCoinIsDisplayed() {
		VendingMachine vm3 = new VendingMachine();
		assertEquals(vm3.insert(), "INSERT COIN");
	}
	
	@Test
	public void whenNickelIsInsertedValueIncreasesByFive() {
		VendingMachine vm2 = new VendingMachine();
		assertEquals("5", vm2.insert(1,1));
		assertEquals("10", vm2.insert(1,1));
	}
}
