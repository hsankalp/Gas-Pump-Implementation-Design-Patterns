package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//To Store the amount of Cash Inserted in Gas Pump 3

public class StoreCash_GP3 extends StoreCash{
	public void StoreCash(DataStore dataStore)
	{
		((DataStore3)dataStore).set_c();
		System.out.println("Gas Pump 3:: Cash Stored: $" + ((DataStore3)dataStore).get_c() );
	}
}
