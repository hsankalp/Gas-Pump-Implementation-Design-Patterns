package gaspump;

import state.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore3;

/**
 * @author sankalp
 * 
 */
/* GP3 collects parameters from the Driver and invokes the events in MDA-EFSM */

public class GP3 {

	MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

	DataStore dataStore = null; // Pointer to DataStore

	public GP3(MDAEFSM mdaefsm, DataStore dataStore) {
		this.mdaefsm = mdaefsm;
		this.dataStore = dataStore;
	}

	public void Activate(float a, float b) {
		// TODO Auto-generated method stub
		if ((a > 0) && (b > 0)) {
			((DataStore3) dataStore).temp_a = a;
			((DataStore3) dataStore).temp_b = b;
			mdaefsm.Activate();
		}

	}

	public void Start() {
		// TODO Auto-generated method stub
		mdaefsm.Start();
	}

	public void PayCash(float c) {
		// TODO Auto-generated method stub
		if (c > 0) {
			((DataStore3) dataStore).temp_c = c;
			((DataStore3) dataStore).w = 0;
			mdaefsm.PayCash();
		}
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		mdaefsm.Cancel();
	}

	public void Regular() {
		// TODO Auto-generated method stub
		((DataStore3) dataStore).set_RPrice();
		mdaefsm.SelectGas(1);

		System.out.println("!!Regular Gas is Selected!!\n");

	}

	public void Premium() {

		((DataStore3) dataStore).set_PPrice();

		mdaefsm.SelectGas(2);

		System.out.println("!!Premium Gas is Selected!!\n");

	}

	public void StartPump() {
		// TODO Auto-generated method stub
		mdaefsm.StartPump();
	}

	public void Pump() {
		if (((DataStore3) dataStore).c < (((DataStore3) dataStore).L + 1)
				* ((DataStore3) dataStore).Price) {
			mdaefsm.StopPump();
			System.out.println("!!Pump Stopped due to Insufficient Cash!!\n");
		} else

			mdaefsm.Pump();

	}

	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.StopPump();

	}

	public void Receipt() {

		mdaefsm.Receipt();
	}

	public void NoReceipt() {

		mdaefsm.NoReceipt();
	}

}
