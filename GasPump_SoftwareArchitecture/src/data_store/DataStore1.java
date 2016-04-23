package data_store;

/**
 * @author sankalp
 * 
 */

/* DATASTORE 1 */

public class DataStore1 extends DataStore {

	public int c; // Cash Variable
	public int W; // Flag for Cash and Credit
	public int G; // Number of Gallons Variable
	public int Price; // Price of gas variable
	public int Total; // Total Amount Variable
	public int temp_a; // Temporary Variable for Gas Price
	public int temp_c; // Temporary Variable for Cash
	public int g; // Number of Gallons Temporary Variable
	public int total; // Total Amount Temporary Variable
	public int w; // Temporary Flag for Cash and Credit

	public void set_a() {

		this.Price = this.temp_a;

	}

	public int get_c() {

		return this.c;
	}

	public void set_c() {

		this.c = this.temp_c;
	}

	public void set_G(int g) {

		this.G = this.g;

	}

	public int get_G() {

		return this.G = this.G + 1;

	}

	public void set_Total(int total) {

		this.Total = this.total;

	}

	public int get_Total() {

		return this.total = this.Price * this.G; // Total amount=(Price*Number of Gallons)
	}

	public void set_W() {
		this.W = this.w;

	}

	public int get_W() {
		return this.W;
	}

	public int get_Price() {
		return this.Price;
	}

}