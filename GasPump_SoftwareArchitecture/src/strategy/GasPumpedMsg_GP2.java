package strategy;

import data_store.DataStore;

//Gas Pump Message to show the number of gallons pumped for Gas Pump 2

import data_store.DataStore2;

public class GasPumpedMsg_GP2 extends GasPumpedMsg{
	
	public void GasPumpedMsg(DataStore dataStore){
		System.out.println(((DataStore2)dataStore).get_G() + " Gallon(s) Pumped"  );
		System.out.println("\nPress 9 to Continue Pumping:\n");
	}

}