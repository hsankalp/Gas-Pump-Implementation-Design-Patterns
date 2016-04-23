package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//To Store the Price of Regular and Premium Gas in Gas Pump 3

public class StoreData_GP3 extends StoreData{
	public void StoreData(DataStore dataStore)
	{
		((DataStore3)dataStore).set_a();
		((DataStore3)dataStore).set_b();
	}
}
