package state;

import state.state;
import state.S;
import state.S0;
import state.S1;
import state.S2;
import state.S3;
import state.S4;
import state.S5;
import state.S6;
import output.Output;
import abstract_factory.AbstractFactory;

/**
 * @author sankalp
 * 
 */
/* MDAEFSM Class changes the states in the Gas Pump */

public class MDAEFSM {

	state S = new S(this);
	state S0 = new S0(this);
	state S1 = new S1(this);
	state S2 = new S2(this);
	state S3 = new S3(this);
	state S4 = new S4(this);
	state S5 = new S5(this);
	state S6 = new S6(this);

	state mdaefsmState = null;

	AbstractFactory factory = null;
	Output output = null;

	public MDAEFSM(AbstractFactory factory, Output output) {
		mdaefsmState = S;
		this.factory = factory;
		this.output = output;
	}

	public void Activate() {

		mdaefsmState.Activate();
		printCurrentState();

	}

	public void Start() {

		mdaefsmState.Start();
		printCurrentState();
	}

	public void PayCredit() {

		mdaefsmState.PayCredit();
		printCurrentState();
	}

	public void PayCash() {

		mdaefsmState.PayCash();
		printCurrentState();
	}

	public void Reject() {

		mdaefsmState.Reject();
		printCurrentState();

	}

	public void Cancel() {

		mdaefsmState.Cancel();
		printCurrentState();

	}

	public void Approved() {

		mdaefsmState.Approved();
		printCurrentState();
	}

	public void StartPump() {

		mdaefsmState.StartPump();
		printCurrentState();
	}

	public void Pump() {

		mdaefsmState.Pump();
		printCurrentState();
	}

	public void StopPump() {

		mdaefsmState.StopPump();
		printCurrentState();
	}

	public void SelectGas(int g) {

		mdaefsmState.SelectGas(g);
		printCurrentState();
	}

	public void Receipt() {

		mdaefsmState.Receipt();
		printCurrentState();
	}

	public void NoReceipt() {

		mdaefsmState.NoReceipt();
		printCurrentState();
	}

	public void setState(state mdaefsmState) {
		this.mdaefsmState = mdaefsmState;
	}

	public state getMachineState() {
		return mdaefsmState;
	}

	public state getS0State() {
		return S0;
	}

	public state getS1State() {
		return S1;
	}

	public state getS2State() {
		return S2;
	}

	public state getS3State() {
		return S3;
	}

	public state getS4State() {
		return S4;
	}

	public state getS5State() {
		return S5;
	}

	public state getS6State() {
		return S6;
	}

	public void printCurrentState() {
		System.out.println("\n" + "Current State : "
				+ mdaefsmState.getClass().getName() + "\n");
	}

}
