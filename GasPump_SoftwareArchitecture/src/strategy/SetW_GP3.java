package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//Sets the cash flag for Gas Pump 3

public class SetW_GP3 extends SetW {

	public void SetW(DataStore dataStore) {

		((DataStore3) dataStore).set_W();
	}

}
