package com.pillar.eval;

public class VendingMachine {
	
	/**
	 * Stores a vending machine's inventory
	 */
	private Integer numNickels = 0;
	private Integer numDimes = 0;
	private Integer numQuarters = 0;
	private Integer trayNickels = 0;
	private Integer trayDimes = 0;
	private Integer trayQuarters = 0;
	private Integer cokePrice = 100;
	private Integer chipsPrice = 50;
	private Integer candyPrice = 65;
	
	private String getValue(){
		if(numNickels==0&&numDimes==0&&numQuarters==0){
			return "INSERT COIN";
		}
		else{
			return String.valueOf(getIntValue());
		}
	}
	private void vendChange(Integer selectionValue){
		Integer remaining = getIntValue()-selectionValue;
		while (remaining>0){
			if(numQuarters>0&&remaining>=25){
				numQuarters--;
				trayQuarters++;//return a quarter
				remaining -= 25;
			}
			if(numDimes>0&&remaining>=10){
				numDimes--;
				trayDimes++;//return a dime
				remaining -= 10;
			}
			if(numNickels>0&&remaining>=5){
				numNickels--;
				trayNickels++;//return a nickel
				remaining -= 5;
			}
		}
		numQuarters = 0;
		numDimes = 0;
		numNickels = 0;
	}
	private Integer getIntValue(){
		return((numNickels*5)+(numDimes)*10+(numQuarters*25));
	}
	public void returnCoins(){
		/**
		 * Returns all inserted coins to the coin tray. They can be 
		 * accessed using getCoins now.
		 */
		vendChange(0);
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
	public Integer[] getCoins(){
		/**
		 * @return coins currently in coin tray. Also clears the coin tray.
		 */
		Integer[] A = {trayQuarters,trayDimes,trayNickels};
		trayQuarters = 0;
		trayDimes = 0;
		trayNickels = 0;
		return A;
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
				vendChange(cokePrice);
				return "THANK YOU";
			}
			else return "PRICE "+cokePrice+" CENTS";
		}
		else if(selection==2){
			if(getIntValue()>=chipsPrice){
				vendChange(chipsPrice);
				return "THANK YOU";
			}
			else return "PRICE "+chipsPrice+" CENTS";
		}
		else if(selection==3){
			if(getIntValue()>=candyPrice){
				vendChange(candyPrice);
				return "THANK YOU";
			}
			else return "PRICE "+candyPrice+" CENTS";
		}
		else return "INVALID PRODUCT SELECTION";
	}
	
}
