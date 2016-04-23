package strategy;

import data_store.DataStore;
import data_store.DataStore1;

//To Store the Price of Gas in Gas Pump 1

public class StoreData_GP1 extends StoreData{
	public void StoreData(DataStore dataStore)
	{
		((DataStore1)dataStore).set_a();
	}
}
