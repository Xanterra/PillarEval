package com.pillar.eval;

public class VendingMachine {
	
	/**
	 * Stores a vending machine's inventory
	 */
	private Integer numNickels = 0;
	private Integer numDimes = 0;
	private Integer numQuarters = 0;
	
	private String getValue(){
		if(numNickels==0&&numDimes==0&&numQuarters==0){
			return "INSERT COIN";
		}
		else{
			return String.valueOf((numNickels*5)+(numDimes)*10+(numQuarters*25));
		}
	}
	
	public String insert(Integer weight, Integer diameter) {
		/**
		 * @return INSERT COIN and additional text to pass the test
		 */
		if(weight==2&diameter==2){
			numNickels++;
		}
		if(weight==2&diameter==1){
			numDimes++;
		}
		return getValue();
	}
	public String insert() {
		/**
		 * @return total value
		 */
		return getValue();
	}
	
}
