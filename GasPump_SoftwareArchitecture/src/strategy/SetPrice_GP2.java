package strategy;

import data_store.DataStore;

//To get the price of the Regular or Super Gas for Total Calculation in Gas Pump 2

import data_store.DataStore2;

public class SetPrice_GP2 extends SetPrice {
	public void SetPrice(DataStore dataStore) {
		
		System.out.println("Gas Pump 2:: Gas Price: "
				+ ((DataStore2) dataStore).get_Price());
	}
}
