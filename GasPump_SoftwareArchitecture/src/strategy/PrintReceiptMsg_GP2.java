package strategy;

import data_store.DataStore;
import data_store.DataStore2;

//Print Receipt Message showing Total amount and the number of gallons pumped for gas pump 2

public class PrintReceiptMsg_GP2 extends PrintReceiptMsg{

	@Override
	public void PrintReceiptMsg(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println("Gas Pump 2:\n");
		
		System.out.println("\nTotal Amount: $" + ((DataStore2)dataStore).get_Total() );
		System.out.println("Quantity:"+ (((DataStore2)dataStore).get_G()-1) + " Gallon(s)" );
	}
	
}
