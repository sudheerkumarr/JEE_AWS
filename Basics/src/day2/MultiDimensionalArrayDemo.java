package day2;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		// Multi dimensional array
		
		// Option 1
		int[][] arr1 = new int[2][3]; // rows - 2 & columns - 3
		
		// 1st row, 1st column
		arr1[0][0] = 10;
		// 1st row, 2nd column
		arr1[0][1] = 20;
		// 1st row, 3rd column
		arr1[0][2] = 30;
		
		// 2nd row, 1st column
		arr1[1][0] = 40;
		// 2nd row, 2nd column
		arr1[1][1] = 50;
		// 2nd row, 3rd column
		arr1[1][2] = 60;
		
		
		for(int i=0; i<arr1.length;i++) { ;// row - 0
			for(int j=0; j<arr1[i].length; j++) {;//column
				System.out.print(arr1[i][j]+" "); // i=0, j=0,1,2
				                                // i=1, j=0,1,2
			}
			System.out.println();
		}
		
		//Option 2
		int[][] arr2 = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		
		
		// Jagged Array
		int[][] arr3 = new int[3][];
		arr3[0] = new int[2];
		arr3[1] = new int[3];
		arr3[2] = new int[4];
		
		/*
		 * 1st Row - 00, 01
		 * 2nd Row - 10, 11, 12
		 * 3rd row - 20, 21, 22, 23
		 */
		arr3[0][0] = 5;
		arr3[0][1] = 15;
		
		arr3[1][0] = 25;
		arr3[1][1] = 35;
		arr3[1][2] = 45;
		
		arr3[2][0] = 55;		
		arr3[2][1] = 65;
		arr3[2][2] = 75;
		arr3[2][3] = 85;		

		System.out.println();
		for(int i = 0; i<arr3.length; i++) {//3
			for(int j=0; j<arr3[i].length;j++) {
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
			
		}
	}

}
