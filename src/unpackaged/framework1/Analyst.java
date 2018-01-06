public class Analyst {
	public static void main (String args[]) {
		Storage store = new Storage();
		store.data[0][0] = 1.0; //not sure why square brackets does not work store.data[0] = {1.0,2.0,3.0,4.0};
		store.data[1][1] = 2.0;
		store.data[2][3] = 3.0;
		System.out.println("Number at [0][0] = " + store.data[0][0]);
		System.out.println("Number at [1][1] = " + store.data[1][1]);
		System.out.println("Number at [2][3] = " + store.data[2][3]);

	}
}