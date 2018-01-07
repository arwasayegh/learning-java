public class ForLoop {
	public static void main (String args[]) {
		for (int i = 5; i > 0; i--) {
			System.out.println(i);
		}
		int [] arr = {10,20,30};
		for (int a: arr) {
			System.out.println(a);
		}
		int i = 3;
		for (; i >= 0; i--) { //>= not ==
			System.out.println(i);
		}
		System.out.println(i);
	}
}