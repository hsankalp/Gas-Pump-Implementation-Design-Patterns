package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//To get the price of the Regular or Premium Gas for Total Calculation in Gas Pump 3

public class SetPrice_GP3 extends SetPrice {
	public void SetPrice(DataStore dataStore) {

		System.out.println("Gas Pump 3:: Gas Price: "
				+ ((DataStore3) dataStore).get_Price());
	}
}
