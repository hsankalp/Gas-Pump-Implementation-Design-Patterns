package strategy;

//Pay Message for Gas Pump 1 for Selecting Payment Method

public class PayMsg_GP1 extends PayMsg{
	public void PayMsg(){
		System.out.println("\n  Select the Payment Method: \n");
		System.out.println("> Credit Card \n");
		System.out.println("> Cash \n");
		System.out.println("Press 2 for Credit Card and 6 for Cash \n");
	}
}
