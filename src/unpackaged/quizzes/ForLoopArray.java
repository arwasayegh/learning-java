public class ForLoopArray {
	public static void main (String args[]) {
		//simple array loop
		int array1DA[] = new int[10];
		for(int i = array1DA.length - 1; i >= 0; i--) {
			array1DA[i] = i + 1;
			System.out.println("i is " + i + "; but array1DA[i] is " + array1DA[i]);
		}
		//copy and add one element to the array
		int array1DB[] = new int[array1DA.length + 1];
		for(int i = 0; i < array1DA.length; i++) {
			array1DB[i] = array1DA[i];
			System.out.println(array1DB[i]);
		}
		array1DB[array1DB.length - 1] = 15;
		System.out.println(array1DB[array1DB.length - 1]);
		//array1DA = null;
		//remove the 5th element of array1DA
		int array1DC[] = new int[array1DA.length - 1];
		for(int i = 0; i < 4; i++) {
			array1DC[i] = array1DA[i];
			System.out.println(array1DC[i]);
		}
		for(int i = 5; i < array1DA.length; i++) {
			array1DC[i - 1] = array1DA[i];
			System.out.println(array1DC[i - 1]);
		}
	}	
}