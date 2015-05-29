package com.pillar.eval;

public class VendingMachine {
	
	/**
	 * Stores a vending machine's inventory
	 */
	private Integer numNickels = 0;
	private Integer numDimes = 0;
	private Integer numQuarters = 0;
	private Integer cokePrice = 100;
	
	private String getValue(){
		if(numNickels==0&&numDimes==0&&numQuarters==0){
			return "INSERT COIN";
		}
		else{
			return String.valueOf(getIntValue());
		}
	}
	private void resetValue(){
		numNickels = 0;
		numDimes = 0;
		numQuarters = 0;
	}
	private Integer getIntValue(){
		return((numNickels*5)+(numDimes)*10+(numQuarters*25));
	}
	
	public String insert(Integer weight, Integer diameter) {
		/**
		 * @return total value
		 */
		if(weight==2&diameter==2){
			numNickels++;
			return getValue();
		}
		if(weight==2&diameter==1){
			numDimes++;
			return getValue();
		}
		if(weight==3&diameter==3){
			numQuarters++;
			return getValue();
		}
		else return "INVALID COIN";
	}
	public String insert() {
		/**
		 * @return total value
		 */
		return getValue();
	}
	public String select(Integer selection) {
		/**
		 * @return THANK YOU if product dispensed
		 */
		if(selection==1){
			if(getIntValue()>=cokePrice){
				resetValue();
				return "THANK YOU";
			}
			else return "PRICE "+cokePrice+" CENTS";
		}
		else return "INVALID PRODUCT SELECTION";
	}
	
}
