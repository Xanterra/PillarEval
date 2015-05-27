package com.pillar.eval;
import org.junit.Test;
import static junit.framework.TestCase.assertFalse;

public class VendingMachineTest {

	@Test
	public void whenCoinsAreInsertedInsertCoinIsNotDisplayed() {
		VendingMachine vm1 = new VendingMachine();
		assertFalse(vm1.insert(1,1).equals("INSERT COIN"));
	}
}
