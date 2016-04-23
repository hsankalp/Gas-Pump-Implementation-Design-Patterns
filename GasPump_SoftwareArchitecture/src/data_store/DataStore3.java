package data_store;

/**
 * @author sankalp
 * 
 */
public class DataStore3 extends DataStore {

	public int g; // Number of Liters Temporary Variable
	public float total; // Total Amount Temporary Variable
	public int w; // Temporary Flag for Cash
	public float temp_a; // Temporary Variable for REGULAR Gas Price
	public float temp_b; // Temporary Variable for PREMIUM Gas Price
	public float temp_c; // Temporary Variable for Cash
	public float c; // Cash Variable
	public int W; // Flag for Cash
	public int L; // Number of Liters Variable
	public float Price; // Price Variable which is set depending on Selection of Gas
	public float Total; // Total Amount Variable
	public float a; // Variable for REGULAR Gas Price
	public float b; // Variable for PREMIUM Gas Price

	public float set_a() {

		return this.a = this.temp_a;
	}

	public float set_b() {

		return this.b = this.temp_b;
	}

	public void set_RPrice() {

		this.Price = this.a;

	}

	public void set_PPrice() {

		this.Price = this.b;
	}

	public float set_c() {

		return this.c = this.temp_c;
	}

	public float get_c() {

		return this.c;
	}

	public int set_L(int g) {
		return this.L = this.g;
	}

	public int get_G() {

		return this.L = this.L + 1;

	}

	public void set_Total(int total) {

		this.Total = this.total;

	}

	public float get_Total() {

		return this.total = this.Price * this.L;// Total amount=(Price*Number of Liters)
	}

	public float get_Price() {

		return this.Price;
	}

	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}

}
