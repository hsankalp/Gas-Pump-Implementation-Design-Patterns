package strategy;

import data_store.DataStore;
import data_store.DataStore1;

//To get the price of the Gas for Total Calculation in Gas Pump 1

public class SetPrice_GP1 extends SetPrice{
	public void SetPrice(DataStore dataStore)
	{
		System.out.println("\nGas Pump 1:: Gas Price: $" + ((DataStore1)dataStore).get_Price() );
		
	}
}
