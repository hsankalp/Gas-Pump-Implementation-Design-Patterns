package gaspump;

import state.MDAEFSM;
import data_store.DataStore;
import data_store.DataStore1;

/**
 * @author sankalp
 * 
 */
/* GP1 collects parameters from the Driver and invokes the events in MDA-EFSM */

public class GP1 {

	MDAEFSM mdaefsm = null; // Pointer to MDA-EFSM

	DataStore dataStore = null; // Pointer to DataStore

	public GP1(MDAEFSM mdaefsm, DataStore dataStore) {
		this.mdaefsm = mdaefsm;
		this.dataStore = dataStore;

	}

	public void Activate(int a) {
		// TODO Auto-generated method stub
		if (a > 0)
			((DataStore1) dataStore).temp_a = a;

		mdaefsm.Activate();
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
		((DataStore1) dataStore).w = 1;
		mdaefsm.Approved();
	}

	public void PayCash(int c) {
		// TODO Auto-generated method stub
		if (c > 0) {
			((DataStore1) dataStore).temp_c = c;
			((DataStore1) dataStore).w = 0;
			mdaefsm.PayCash();
		}
	}

	public void StartPump() {
		// TODO Auto-generated method stub
		mdaefsm.SelectGas(1);
		mdaefsm.StartPump();

	}

	public void Pump() {

		if (((DataStore1) dataStore).W == 1) {

			mdaefsm.Pump();

		}

		else if (((DataStore1) dataStore).W == 0) {

			if (((DataStore1) dataStore).c < (((DataStore1) dataStore).g + 1)
					* ((DataStore1) dataStore).Price) {
				mdaefsm.StopPump();
				System.out
						.println("!!Pump Stopped due to Insufficient Cash!!\n");
				mdaefsm.Receipt();
			}

			else {
				((DataStore1) dataStore).g = ((DataStore1) dataStore).g + 1;
				mdaefsm.Pump();

			}
		}

	}

	public void StopPump() {
		// TODO Auto-generated method stub
		mdaefsm.StopPump();
		mdaefsm.Receipt();
	}

}
