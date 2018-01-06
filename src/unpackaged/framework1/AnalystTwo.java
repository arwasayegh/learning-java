public class AnalystTwo {
	public static void main (String args[]) {
		StorageTwo store = new StorageTwo();
		store.data[0][0] = new Point();
		store.data[0][0].x = 10;
		store.data[0][0].y = 5;
		store.data[0][0].z = "A";
		System.out.println(store.data[0][0].z);

	}
}