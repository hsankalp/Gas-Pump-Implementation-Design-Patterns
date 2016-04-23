package strategy;

import data_store.DataStore;

//Gas Pump Message to show the number of gallons pumped for Gas Pump 1

import data_store.DataStore1;

public class GasPumpedMsg_GP1 extends GasPumpedMsg{
	
	public void GasPumpedMsg(DataStore dataStore){
		System.out.println(((DataStore1)dataStore).get_G() + " Gallon(s) Pumped" );
		System.out.println("\nPress 8 to Continue Pumping:\n");
	}

}
