package abstract_factory;

import data_store.DataStore;
import data_store.DataStore2;
import strategy.*;

/**
 * @author sankalp
 * 
 */

/* CONCRETE FACTORY FOR ATM 2 */

public class ConcreteFactory2 implements AbstractFactory {

	DataStore dataStore = new DataStore2();
	StoreData storedata = new StoreData_GP2();
	PayMsg paymsg = new PayMsg_GP2();
	DisplayMenu displaymenu = new DisplayMenu_GP2();
	RejectMsg rejectmsg = new RejectMsg();
	ReadyMsg readymsg = new ReadyMsg();
	PumpGasUnit pumpgasunit = new PumpGasUnit_GP2();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg_GP2();
	StopMsg stopmsg = new StopMsg();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg_GP2();
	CancelMsg cancelmsg = new CancelMsg();
	SetInitialValues setinitialvalues = new SetInitialValues_GP2();
	SetPrice setprice = new SetPrice_GP2();
	SetW setw = new SetW_GP2();

	public void ConcreteFactory() {

	}

	public DataStore CreateDataStore() {
		return (this.dataStore);
	}

	public DataStore GetDataStore() {
		return this.dataStore;
	}

	@Override
	public StoreData CreateStoreData() {
		// TODO Auto-generated method stub
		return this.storedata;
	}

	@Override
	public PayMsg CreatePayMsg() {
		// TODO Auto-generated method stub
		return this.paymsg;
	}

	@Override
	public DisplayMenu CreateDisplayMenu() {
		// TODO Auto-generated method stub
		return this.displaymenu;
	}

	@Override
	public RejectMsg CreateRejectMsg() {
		// TODO Auto-generated method stub
		return this.rejectmsg;
	}

	@Override
	public SetW CreateSetW() {
		// TODO Auto-generated method stub
		return this.setw;
	}

	@Override
	public SetPrice CreateSetPrice() {
		// TODO Auto-generated method stub
		return this.setprice;
	}

	@Override
	public ReadyMsg CreateReadyMsg() {
		// TODO Auto-generated method stub
		return this.readymsg;
	}

	@Override
	public SetInitialValues CreateSetInitialValues() {
		// TODO Auto-generated method stub
		return this.setinitialvalues;
	}

	@Override
	public PumpGasUnit CreatePumpGasUnit() {
		// TODO Auto-generated method stub
		return this.pumpgasunit;
	}

	@Override
	public GasPumpedMsg CreateGasPumpedMsg() {
		// TODO Auto-generated method stub
		return this.gaspumpedmsg;
	}

	@Override
	public StopMsg CreateStopMsg() {
		// TODO Auto-generated method stub
		return this.stopmsg;
	}

	@Override
	public PrintReceiptMsg CreatePrintReceiptMsg() {
		// TODO Auto-generated method stub
		return this.printreceiptmsg;
	}

	@Override
	public CancelMsg CreateCancelMsg() {
		// TODO Auto-generated method stub
		return this.cancelmsg;
	}

	@Override
	public StoreCash CreateStoreCash() {
		// TODO Auto-generated method stub
		return null;
	}

}
