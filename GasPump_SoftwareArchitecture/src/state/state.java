package state;

/**
 * @author sankalp
 * 
 */
/* STATE PATTERN */

public interface state {

	public void Activate();

	public void Start();

	public void PayCredit();

	public void PayCash();

	public void Reject();

	public void Cancel();

	public void Approved();

	public void SelectGas(int g);

	public void StartPump();

	public void Pump();

	public void StopPump();

	public void Receipt();

	public void NoReceipt();

}
