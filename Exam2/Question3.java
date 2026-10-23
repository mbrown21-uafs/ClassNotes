package Exam2;

public class Question3 {		
		public static void main(String[] args) {
			String str = "This is a test";
			char delim = 's';
			String[] tokens;
			
			
			tokens = split(str,delim);
			showArray(tokens);
			

		}
		public static void showArray(String[] array) {
			int index;
			
			System.out.printf("[");
			for(index=0;index<array.length;index++) {
				if(index!=0) {
					System.out.printf(",");
				}
				System.out.printf("%s", array[index]);
			}
			System.out.printf("]\n");
		}
		
		public static String[] split(String str, char delim) {
			String[] fields;
			int index;
			char ch;
			int count = 0;
			int sIndex = 0;
			String token = "";
			
			for(index = 0; index < str.length(); index++) {
				ch = str.charAt(index);
				if(ch==delim) {
					count++;
				}
			}
		
			fields = new String[count + 1];
			
			for(index = 0; index < str.length(); index++) {
				ch = str.charAt(index);
				if(ch==delim) {
					fields[sIndex++] = token;
					token = "";
					
				}else {
					token = token + ch;
				}
			}
			fields[sIndex++] = token;
			
			return fields;
		}


}


