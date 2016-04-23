package output;

import strategy.*;
import abstract_factory.*;
import data_store.DataStore;

/**
 * @author sankalp
 * 
 */
/*The Output Class contains all the actions*/

public class Output {

	AbstractFactory factory = null;
	DataStore dataStore = null;

	public Output(AbstractFactory factory, DataStore dataStore) {
		this.factory = factory;
		this.dataStore = dataStore;
	}

	public void StoreData() {
		// TODO Auto-generated method stub
		System.out.println("\n !!Gas Pump is Activated!! \n");
		StoreData storedata = factory.CreateStoreData();
		storedata.StoreData(dataStore);
	}

	public void PayMsg() {
		// TODO Auto-generated method stub
		PayMsg paymsg = factory.CreatePayMsg();
		paymsg.PayMsg();
	}

	public void StoreCash() {
		// TODO Auto-generated method stub
		StoreCash storecash = factory.CreateStoreCash();
		storecash.StoreCash(dataStore);

	}

	public void DisplayMenu() {
		// TODO Auto-generated method stub
		DisplayMenu displaymenu = factory.CreateDisplayMenu();
		displaymenu.DisplayMenu();
	}

	public void RejectMsg() {
		// TODO Auto-generated method stub
		RejectMsg rejectmsg = factory.CreateRejectMsg();
		rejectmsg.RejectMsg();
	}

	public void ReadyMsg() {
		// TODO Auto-generated method stub
		ReadyMsg readymsg = factory.CreateReadyMsg();
		readymsg.ReadyMsg();
	}

	public void PumpGasUnit() {
		// TODO Auto-generated method stub
		PumpGasUnit pumpgasunit = factory.CreatePumpGasUnit();
		pumpgasunit.PumpGasUnit();
	}

	public void GasPumpedMsg() {
		// TODO Auto-generated method stub
		GasPumpedMsg gaspumpedmsg = factory.CreateGasPumpedMsg();
		gaspumpedmsg.GasPumpedMsg(dataStore);
	}

	public void StopMsg() {
		// TODO Auto-generated method stub
		StopMsg stopmsg = factory.CreateStopMsg();
		stopmsg.StopMsg();
	}

	public void PrintReceiptMsg() {
		// TODO Auto-generated method stub
		System.out.println("\n RECEIPT: \n");
		PrintReceiptMsg printreceiptmsg = factory.CreatePrintReceiptMsg();
		printreceiptmsg.PrintReceiptMsg(dataStore);
	}

	public void CancelMsg() {
		// TODO Auto-generated method stub
		CancelMsg cancelmsg = factory.CreateCancelMsg();
		cancelmsg.CancelMsg();
	}

	public void SetInitialValues() {
		// TODO Auto-generated method stub
		SetInitialValues setinitialvalues = factory.CreateSetInitialValues();
		setinitialvalues.SetInitialValues(dataStore);
	}

	public void SetW() {
		// TODO Auto-generated method stub
		System.out.println("\n !!Approved!! \n");
		SetW setw = factory.CreateSetW();
		setw.SetW(dataStore);
	}

	public void SetPrice() {
		// TODO Auto-generated method stub
		SetPrice setprice = factory.CreateSetPrice();
		setprice.SetPrice(dataStore);
	}

}
