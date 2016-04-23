package strategy;

import data_store.DataStore;
import data_store.DataStore1;

//Print Receipt Message showing Total amount and the number of gallons pumped for gas pump 1

public class PrintReceiptMsg_GP1 extends PrintReceiptMsg{

	@Override
	public void PrintReceiptMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump 1:\n");

		System.out.println("\nTotal Amount: $" +((DataStore1)dataStore).get_Total() );
		System.out.println("Quantity:"+ (((DataStore1)dataStore).get_G()-1) + " Gallon(s)" );
	}

}
