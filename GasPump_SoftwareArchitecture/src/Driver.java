import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import state.MDAEFSM;
import output.Output;
import abstract_factory.ConcreteFactory1;
import abstract_factory.ConcreteFactory2;
import abstract_factory.ConcreteFactory3;
import gaspump.GP1;
import gaspump.GP2;
import gaspump.GP3;

/**
 * @author sankalp
 * 
 */

						/*MAIN FUNCTION*/

public class Driver {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
		String input = null;
		int choice = 1;

		System.out.println(" ******** Select the Gas Pump to be used *******");
		System.out.println("          1. GAS PUMP: 1");
		System.out.println("          2. GAS PUMP: 2");
		System.out.println("          3. GAS PUMP: 3");

		input = bufferedReader.readLine();
		if (input.equalsIgnoreCase("1")) {

			ConcreteFactory1 factory = new ConcreteFactory1();
			Output output = new Output(factory, factory.GetDataStore());
			MDAEFSM efsm = new MDAEFSM(factory, output);
			GP1 gp1 = new GP1(efsm, factory.GetDataStore());

			int a, c;
			System.out.println("*************************************");
			System.out.println("          Gas Pump-1 Selected \n");
			System.out.println("          MENU of Operations");
			System.out.println("          0. Activate(int)");
			System.out.println("          1. Start()");
			System.out.println("          2. PayCredit");
			System.out.println("          3. Reject()");
			System.out.println("          4. Cancel()");
			System.out.println("          5. Approved()");
			System.out.println("          6. PayCash(int)");
			System.out.println("          7. StartPump()");
			System.out.println("          8. PumpGallon()");
			System.out.println("          9. StopPump()");
			System.out.println("          q. Quit the Program");
			System.out.println("  Please make a note of these operations");
			System.out.println("           Gas Pump-1 Execution");

			while (true) {

				System.out.println("  Select Operation: ");
				System.out
						.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-PumpGallon, 9-StopPump, q-quit");

				input = bufferedReader.readLine();

				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;

				choice = Integer.parseInt(input);

				switch (choice) {

				case 0://ACTIVATE
					System.out.println("\n  Operation:  Activate(int a)");
					System.out.println("   Enter the Price of the Gas");
					input = bufferedReader.readLine();
					a = Integer.parseInt(input);
					gp1.Activate(a);

					break;

				case 1://START
					System.out.println("  Operation:  Start()");
					gp1.Start();
					break;

				case 2://PAY BY CREDIT CARD
					System.out.println("  Operation:  PayCredit()");
					gp1.PayCredit();
					break;

				case 3://REJECT
					System.out.println("  Operation:  Reject()");

					gp1.Reject();
					break;

				case 4://CANCEL
					System.out.println("  Operation: Cancel()");
					gp1.Cancel();
					break;

				case 5://APPROVED
					System.out.println("  Operation:  Approved()");
					gp1.Approved();
					break;

				case 6://PAY BY CASH 

					System.out.println("  Operation:  PayCash(int c)");
					System.out.println("  Enter the amount of cash:");
					input = bufferedReader.readLine();
					c = Integer.parseInt(input);
					gp1.PayCash(c);

					break;

				case 7://START PUMP
					System.out.println("  Operation:  StartPump()");
					gp1.StartPump();
					break;

				case 8://PUMP GALLON
					System.out.println("  Operation:  PumpGallon()");
					gp1.Pump();
					break;

				case 9://STOP PUMP
					System.out.println("  Operation:  StopPump()");
					gp1.StopPump();
					break;

				default://INVALID SELECTION
					System.out.println("Invalid Choice");
					break;
				}
			}
			System.out.println("Thanks for using Gas Pump 1");
		} else if (input.equalsIgnoreCase("2")) {
			ConcreteFactory2 factory = new ConcreteFactory2();
			Output output = new Output(factory, factory.GetDataStore());
			MDAEFSM efsm = new MDAEFSM(factory, output);
			GP2 gp2 = new GP2(efsm, factory.GetDataStore());

			float a;
			float b;

			System.out.println("*************************************");
			System.out.println("          Gas Pump-2 Selected \n");
			System.out.println("          MENU of Operations");
			System.out.println("          0. Activate(int)");
			System.out.println("          1. Start()");
			System.out.println("          2. PayCredit");
			System.out.println("          3. Reject()");
			System.out.println("          4. Cancel()");
			System.out.println("          5. Approved()");
			System.out.println("          6. Regular()");
			System.out.println("          7. Super()");
			System.out.println("          8. StartPump()");
			System.out.println("          9. PumpGallon()");
			System.out.println("          10. StopPump()");
			System.out.println("          q. Quit the Program");
			System.out.println("  Please make a note of these operations");
			System.out.println("           Gas Pump-2 Execution");

			while (true) {

				System.out.println("  Select Operation: ");
				System.out
						.println("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-Regular, 7-Super, 8-StartPump, 9-PumpGallon, 10-StopPump, q-quit");

				input = bufferedReader.readLine();

				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;

				choice = Integer.parseInt(input);

				switch (choice) {

				case 0://ACTIVATE
					System.out
							.println("\n  Operation:  Activate(float a, float b)");

					System.out.println("   Enter the Price of Regular Gas: ");
					input = bufferedReader.readLine();
					a = Float.parseFloat(input);

					System.out.println("   Enter the Price of Super Gas: ");
					input = bufferedReader.readLine();
					b = Float.parseFloat(input);

					gp2.Activate(a, b);

					break;

				case 1://START
					System.out.println("  Operation:  Start()");
					gp2.Start();
					break;

				case 2://PAY BY CREDIT CARD
					System.out.println("  Operation:  PayCredit()");
					gp2.PayCredit();
					break;

				case 3://REJECT
					System.out.println("  Operation:  Reject()");

					gp2.Reject();
					break;

				case 4://CANCEL
					System.out.println("  Operation: Cancel()");
					gp2.Cancel();
					break;

				case 5://APPROVED
					System.out.println("  Operation:  Approved()");
					gp2.Approved();
					break;

				case 6://REGULAR GAS 
					System.out.println("  Operation:  Regular()");
					gp2.Regular();
					break;

				case 7://SUPER GAS
					System.out.println("  Operation:  Super()");
					gp2.Super();
					break;

				case 8://START  PUMP
					System.out.println("  Operation:  StartPump()");
					gp2.StartPump();
					break;

				case 9://PUMP GALLON
					System.out.println("  Operation:  PumpGallon()");
					gp2.Pump();
					break;

				case 10://STOP PUMP
					System.out.println("  Operation:  StopPump()");
					gp2.StopPump();
					break;

				default://INVALID SELECTION
					System.out.println("Invalid Choice");
					break;
				}
			}
			System.out.println("Thanks for using Gas Pump 2");
		} else if (input.equalsIgnoreCase("3")) {
			ConcreteFactory3 factory = new ConcreteFactory3();
			Output output = new Output(factory, factory.GetDataStore());
			MDAEFSM efsm = new MDAEFSM(factory, output);
			GP3 gp3 = new GP3(efsm, factory.GetDataStore());

			float a, b, c;

			System.out.println("*************************************");
			System.out.println("          Gas Pump-3 Selected \n");
			System.out.println("          MENU of Operations");
			System.out.println("          0. Activate(int)");
			System.out.println("          1. Start()");
			System.out.println("          2. PayCash(int)");
			System.out.println("          3. Cancel()");
			System.out.println("          4. Regular()");
			System.out.println("          5. Premium()");
			System.out.println("          6. StartPump()");
			System.out.println("          7. PumpLiter()");
			System.out.println("          8. StopPump()");
			System.out.println("          9. Receipt()");
			System.out.println("          10. NoReceipt()");
			System.out.println("          q. Quit the Program");
			System.out.println("  Please make a note of these operations");
			System.out.println("           Gas Pump-3 Execution");

			while (true) {

				System.out.println("  Select Operation: ");
				System.out
						.println("0-Activate,1-Start,2-PayCash,3-Cancel,4-Regular, 5-Premium ,6-StartPump, 7-PumpGallon, 8-StopPump, 9-Receipt, 10-No Receipt, q-quit");

				input = bufferedReader.readLine();

				if (input.isEmpty())
					continue;
				if (input.equalsIgnoreCase("q"))
					break;

				choice = Integer.parseInt(input);

				switch (choice) {

				case 0://ACTIVATE
					System.out
							.println("\n  Operation:  Activate(float a, float b)");

					System.out.println("   Enter the Price of Regular Gas: ");
					input = bufferedReader.readLine();
					a = Float.parseFloat(input);

					System.out.println("   Enter the Price of Premium Gas: ");
					input = bufferedReader.readLine();
					b = Float.parseFloat(input);

					gp3.Activate(a, b);

					break;

				case 1://START
					System.out.println("  Operation:  Start()");
					gp3.Start();
					break;

				case 2://PAY BY CASH

					System.out.println("  Operation:  PayCash(int c)");
					System.out.println("  Enter the amount of cash: ");
					input = bufferedReader.readLine();
					c = Float.parseFloat(input);

					gp3.PayCash(c);

					break;

				case 3://CANCEL
					System.out.println("  Operation: Cancel()");
					gp3.Cancel();
					break;

				case 4://REGULAR GAS
					System.out.println("  Operation:  Regular()");
					gp3.Regular();
					break;

				case 5://PREMIUM GAS
					System.out.println("  Operation:  Premium()");
					gp3.Premium();
					break;

				case 6://START PUMP
					System.out.println("  Operation:  StartPump()");
					gp3.StartPump();
					break;

				case 7:// PUMP LITER
					System.out.println("  Operation:  PumpLiter()");
					gp3.Pump();
					break;

				case 8://STOP PUMP
					System.out.println("  Operation:  StopPump()");
					gp3.StopPump();
					break;

				case 9://RECEIPT
					System.out.println("  Operation:  Receipt()");
					gp3.Receipt();
					break;

				case 10://NO RECEIPT
					System.out.println("  Operation:  NoReceipt()");
					gp3.NoReceipt();
					break;

				default://INVALID SELECTION
					System.out.println("Invalid Choice");
					break;
				}
			}
			System.out.println("Thanks for using Gas Pump 3");
		}
	}

}
