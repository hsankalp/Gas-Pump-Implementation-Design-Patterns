package state;

/**
 * @author sankalp
 * 
 */
/* STATE DESIGN PATTERN */
/* S5 State */

public class S5 implements state {

	MDAEFSM state = null;

	public S5(MDAEFSM state) {
		this.state = state;
	}

	@Override
	public void Activate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Start() {
		// TODO Auto-generated method stub

	}

	@Override
	public void PayCredit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void PayCash() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Reject() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Cancel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Approved() {
		// TODO Auto-generated method stub

	}

	@Override
	public void StartPump() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Pump() {
		// TODO Auto-generated method stub
		state.output.PumpGasUnit();
		state.output.GasPumpedMsg();
		state.setState(state.getS5State());
	}

	@Override
	public void StopPump() {
		// TODO Auto-generated method stub
		state.output.StopMsg();
		state.setState(state.getS6State());
	}

	@Override
	public void Receipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void NoReceipt() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SelectGas(int g) {
		// TODO Auto-generated method stub

	}

}
