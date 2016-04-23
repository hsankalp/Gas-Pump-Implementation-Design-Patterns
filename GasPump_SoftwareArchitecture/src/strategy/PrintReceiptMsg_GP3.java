package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//Print Receipt Message showing Total amount and the number of liters pumped for gas pump 1

public class PrintReceiptMsg_GP3 extends PrintReceiptMsg{

	@Override
	public void PrintReceiptMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump 3:\n");

		System.out.println("\nTotal Amount: $" + ((DataStore3)dataStore).get_Total() );
		System.out.println("Quantity:"+ (((DataStore3)dataStore).get_G()-1) + " Gallon(s)" );
	}
	
}
