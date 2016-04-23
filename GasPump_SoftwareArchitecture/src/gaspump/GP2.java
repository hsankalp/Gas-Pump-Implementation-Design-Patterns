package gaspump;

import state.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore2;

/**
 * @author sankalp
 * 
 */
/* GP2 collects parameters from the Driver and invokes the events in MDA-EFSM */

public class GP2 {
	MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

	DataStore dataStore = null; // Pointer to DataStore

	public GP2(MDAEFSM mdaefsm, DataStore dataStore) {
		this.mdaefsm = mdaefsm;
		this.dataStore = dataStore;

	}

	public void Activate(float a, float b) {
		// TODO Auto-generated method stub
		if ((a > 0) && (b > 0)) {
			((DataStore2) dataStore).temp_a = a;
			((DataStore2) dataStore).temp_b = b;
			mdaefsm.Activate();
		}

	}

	public void Start() {
		// TODO Auto-generated method stub
		mdaefsm.Start();
	}

	public void PayCredit() {
		// TODO Auto-generated method stub
		mdaefsm.PayCredit();
		System.out.println("\n !!Waiting for Approval!! \n");
	}

	public void Reject() {
		// TODO Auto-generated method stub
		mdaefsm.Reject();
	}

	public void Cancel() {
		// TODO Auto-generated method stub
		mdaefsm.Cancel();
	}

	public void Approved() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).w = 1;
		mdaefsm.Approved();
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		mdaefsm.StartPump();
	}

	public void Pump() {

		mdaefsm.Pump();

	}

	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.StopPump();
		mdaefsm.Receipt();
	}

	public void Regular() {
		// TODO Auto-generated method stub
		((DataStore2) dataStore).set_RPrice();
		mdaefsm.SelectGas(1);

		System.out.println("!!Regular Gas is Selected!!\n");

	}

	public void Super() {

		((DataStore2) dataStore).set_SPrice();
		mdaefsm.SelectGas(2);

		System.out.println("!!Super Gas is Selected!!\n");

	}

}
