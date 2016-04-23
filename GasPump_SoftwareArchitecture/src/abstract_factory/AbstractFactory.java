package abstract_factory;

import strategy.*;

/**
 * @author sankalp
 * 
 */

/* ABSTRACT FACTORY PATTERN START HERE */

public interface AbstractFactory {
	public StoreData CreateStoreData();

	public PayMsg CreatePayMsg();

	public StoreCash CreateStoreCash();

	public DisplayMenu CreateDisplayMenu();

	public RejectMsg CreateRejectMsg();

	public SetW CreateSetW();

	public SetPrice CreateSetPrice();

	public ReadyMsg CreateReadyMsg();

	public SetInitialValues CreateSetInitialValues();

	public PumpGasUnit CreatePumpGasUnit();

	public GasPumpedMsg CreateGasPumpedMsg();

	public StopMsg CreateStopMsg();

	public PrintReceiptMsg CreatePrintReceiptMsg();

	public CancelMsg CreateCancelMsg();
}