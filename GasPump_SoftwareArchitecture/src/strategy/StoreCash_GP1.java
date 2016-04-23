package strategy;

import data_store.DataStore;
import data_store.DataStore1;

//To Store the amount of Cash Inserted in Gas Pump 1

public class StoreCash_GP1 extends StoreCash{
	public void StoreCash(DataStore dataStore)
	{
		((DataStore1)dataStore).set_c();
		System.out.println("Gas Pump 1:: Cash Stored: $" + ((DataStore1)dataStore).get_c() );
	}
}
