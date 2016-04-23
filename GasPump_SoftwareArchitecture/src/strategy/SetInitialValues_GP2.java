package strategy;

import data_store.DataStore;
import data_store.DataStore2;

//Set Initial values initializes the Total and Number of Gallons to 0 for GP 2

public class SetInitialValues_GP2 extends SetInitialValues {

	@Override
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub
		((DataStore2)dataStore).set_G(0);
		((DataStore2)dataStore).set_Total(0);
	}
	

}
