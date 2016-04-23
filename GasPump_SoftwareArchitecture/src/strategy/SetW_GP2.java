package strategy;

import data_store.DataStore;
import data_store.DataStore2;

//Sets the credit flag for Gas Pump 2

public class SetW_GP2 extends SetW {

	public void SetW(DataStore dataStore) {

		((DataStore2) dataStore).set_W();
	}

}
