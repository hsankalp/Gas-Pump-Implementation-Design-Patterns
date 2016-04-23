package strategy;

import data_store.DataStore;
import data_store.DataStore3;

//Gas Pump Message to show the number of gallons pumped for Gas Pump 3

public class GasPumpedMsg_GP3 extends GasPumpedMsg{
	
	public void GasPumpedMsg(DataStore dataStore){
		System.out.println(((DataStore3)dataStore).get_G() + " Liter(s) Pumped"  );
		System.out.println("\nPress 7 to Continue Pumping:\n");
	}

}
