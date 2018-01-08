public class ForLoopArrayNested {
	public static void main (String args[]) {
		//simple array loop
		int array1DA[] = new int[10];
		for(int i = array1DA.length - 1; i >= 0; i--) {
			array1DA[i] = i + 1;
			System.out.println("i is " + i + "; but array1DA[i] is " + array1DA[i]);
		}
		//nested loop
		System.out.println("Pause");
		int array2DA[][] = new int[4][5];
		for(int i = 0; i < array2DA.length; i++) {
			for(int j = 0; j < array2DA[i].length; j++){
				array2DA[i][j] = j;
				System.out.println(array2DA[i][j]);
			}
		}
		//copy 2D array
		System.out.println("Pause");
		int array2DB[][] = new int[array2DA.length][array2DA[1].length];
		for(int i = 0; i < array2DA.length; i++) {
			for(int j = 0; j < array2DA[i].length; j++){
				array2DB[i][j] = array2DA[i][j];
				System.out.print(array2DB[i][j] + " ");
			}
			System.out.println("");
		}
		//ok
		System.out.println("Pause");
		int array2DC[][] = new int[array2DA.length - 1][array2DA[1].length - 1];
		for(int i = 1; i < array2DA.length - 1; i++) {
			for(int j = 1; j < array2DA[i].length - 1; j++){
				array2DC[i][j] = array2DA[i - 1][j - 1];
				System.out.println(array2DC[i][j]);
			}
		}
	}	
}