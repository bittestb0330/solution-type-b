package problem01;

public class Main {
	public static void main(String[] args) {
		int[] arr = { -10, -3, 5, 6, -20 };
		findMaxProduct(arr);
	}

	public static void findMaxProduct(int[] arr) {
		
		//
		// 코드를 완성 하십시오.
		//
		int max = 0;
		int[] resultArr = new int[2];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (max < arr[i]*arr[j]) {
					max = arr[i]*arr[j];
					resultArr[0] = arr[i];
					resultArr[1] = arr[j];							
				}
			}
		}
		
		System.out.println("["+resultArr[0]+","+resultArr[1]+"]");
		
	}
}
