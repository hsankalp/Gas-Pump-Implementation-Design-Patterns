package abstract_factory;

import data_store.DataStore;
import data_store.DataStore1;
import strategy.*;

/**
 * @author sankalp
 * 
 */

/* CONCRETE FACTORY FOR ATM 1 */

public class ConcreteFactory1 implements AbstractFactory {

	DataStore dataStore = new DataStore1();
	StoreData storedata = new StoreData_GP1();
	PayMsg paymsg = new PayMsg_GP1();
	StoreCash storecash = new StoreCash_GP1();
	DisplayMenu displaymenu = new DisplayMenu_GP1();
	RejectMsg rejectmsg = new RejectMsg();
	ReadyMsg readymsg = new ReadyMsg();
	PumpGasUnit pumpgasunit = new PumpGasUnit_GP1();
	GasPumpedMsg gaspumpedmsg = new GasPumpedMsg_GP1();
	StopMsg stopmsg = new StopMsg();
	PrintReceiptMsg printreceiptmsg = new PrintReceiptMsg_GP1();
	CancelMsg cancelmsg = new CancelMsg();
	SetInitialValues setinitialvalues = new SetInitialValues_GP1();
	SetW setw = new SetW_GP1();
	SetPrice setprice = new SetPrice_GP1();

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
	public StoreCash CreateStoreCash() {
		// TODO Auto-generated method stub
		return this.storecash;
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
	public DisplayMenu CreateDisplayMenu() {
		// TODO Auto-generated method stub
		return this.displaymenu;
	}

}
