package com.pillar.eval;
import org.junit.Test;
import org.junit.Before;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertEquals;

public class VendingMachineTest {
	/*Select Product*/
	@Test
	public void whenCoinsAreInsertedInsertCoinIsNotDisplayed() {
		VendingMachine vm = new VendingMachine();
		assertFalse(vm.insert(2,2).equals("INSERT COIN"));
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
	/* Make Change */
	@Test
	public void whenColaIsSelectedButNotEnoughPaidPriceDisplayed() {
		VendingMachine vm7 = new VendingMachine();
		for(int i=0; i<=2; i++){vm7.insert(3,3);}
		assertEquals("PRICE 100 CENTS", vm7.select(1));
	}
	@Test
	public void whenColaIsSelectedAndProperlyPaidCokeDispensedAndValueReset() {
		VendingMachine vm8 = new VendingMachine();
		for(int i=0; i<=3; i++){vm8.insert(3,3);}
		assertEquals("THANK YOU", vm8.select(1));
		assertEquals("INSERT COIN", vm8.insert());
	}
	@Test
	public void whenChipsIsSelectedButNotEnoughPaidPriceDisplayed() {
		VendingMachine vm7 = new VendingMachine();
		vm7.insert(3,3);
		assertEquals("PRICE 50 CENTS", vm7.select(2));
	}
	@Test
	public void whenChipsIsSelectedAndProperlyPaidChipsDispensedAndValueReset() {
		VendingMachine vm8 = new VendingMachine();
		vm8.insert(3,3);
		vm8.insert(3,3);
		assertEquals("THANK YOU", vm8.select(2));
		assertEquals("INSERT COIN", vm8.insert());
	}
}
