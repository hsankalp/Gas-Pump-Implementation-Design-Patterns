package strategy;

import data_store.DataStore;
import data_store.DataStore1;

//Sets the credit or cash flag for Gas Pump 1

public class SetW_GP1 extends SetW {

	public void SetW(DataStore dataStore) {

		((DataStore1) dataStore).set_W();
	}

}
