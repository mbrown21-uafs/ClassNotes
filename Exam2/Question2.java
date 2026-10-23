package Exam2;

public class Question2 {
		public static void main(String[] args) {
			int[] array1 = {1,1,1,1,1};
			int[] array2 = {2,2,2,2,2};
			int[] result;
			
			result = interleave(array1,array2);
			showArray(result);
			

		}
		public static void showArray(int[] array) {
			int index;
			
			System.out.printf("[");
			for(index=0;index<array.length;index++) {
				if(index!=0) {
					System.out.printf(",");
				}
				System.out.printf("%d", array[index]);
			}
			System.out.printf("]\n");
		}
		
		public static int[] interleave(int[] array1, int[] array2) {
			int index;
			
			int[] newArray = new int[10];
			
			for(index = 0; index < newArray.length; index++) {
				
				newArray[0] = array1[0];
				newArray[1] = array2[0];
				newArray[2] = array1[1];
				newArray[3] = array2[1];
				newArray[4] = array1[2];
				newArray[5] = array2[2];
				newArray[6] = array1[3];
				newArray[7] = array2[3];
				newArray[8] = array1[4];
				newArray[9] = array2[4];
			}
			
			return newArray;
		}

	}
