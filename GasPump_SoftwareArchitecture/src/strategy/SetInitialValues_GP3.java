package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//Set Initial values initializes the Total and Number of Liters to 0 for GP 3

public class SetInitialValues_GP3 extends SetInitialValues{

	@Override
	public void SetInitialValues(DataStore dataStore) {
		// TODO Auto-generated method stub
		((DataStore3)dataStore).set_L(0);
		((DataStore3)dataStore).set_Total(0);
	}

}
