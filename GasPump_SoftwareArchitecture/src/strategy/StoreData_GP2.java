package strategy;

import data_store.DataStore;
import data_store.DataStore2;

//To Store the Price of Regular and Super Gas in Gas Pump 2

public class StoreData_GP2 extends StoreData{
	public void StoreData(DataStore dataStore)
	{
		((DataStore2)dataStore).set_a();
		((DataStore2)dataStore).set_b();
	}
}
