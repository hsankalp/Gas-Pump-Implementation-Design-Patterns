package strategy;

//Set Initial values initializes the Total and Number of Gallons to 0 for GP 1

import data_store.DataStore;
import data_store.DataStore1;

public class SetInitialValues_GP1 extends SetInitialValues {

	@Override
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub
		((DataStore1)dataStore).set_G(0);
		((DataStore1)dataStore).set_Total(0);
	}

}
