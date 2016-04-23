package data_store;

/**
 * @author sankalp
 * 
 */

/* DATASTORE 2 */
public class DataStore2 extends DataStore {

	public int g; // Number of Gallons Temporary Variable
	public float total; // Total Amount Temporary Variable
	public int w; // Temporary Flag for Credit
	public float temp_a; // Temporary Variable for REGULAR Gas Price
	public float temp_b; // Temporary Variable for SUPER Gas Price
	public int W; // Flag for Credit
	public int G; // Number of Gallons Variable
	public float Price; // Price Variable which is set depending on Selection of Gas
	public float Total; // Total Amount Variable
	public float a; // Variable for REGULAR Gas Price
	public float b; // Variable for SUPER Gas Price

	public float set_a() {

		return this.a = this.temp_a;
	}

	public float set_b() {

		return this.b = this.temp_b;
	}

	public void set_RPrice() {

		this.Price = this.a;

	}

	public void set_SPrice() {

		this.Price = this.b;
	}

	public int set_G(int g) {
		return this.G = this.g;
	}

	public int get_G() {

		return this.G = this.G + 1;

	}

	public void set_Total(int total) {

		this.Total = this.total;

	}

	public float get_Total() {

		return this.total = this.Price * this.G;// Total amount=(Price*Number of Gallons)
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
