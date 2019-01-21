import java.util.Arrays;

public class ArrangeNegToPos {
	
	public static void main(String[] args) {
		int arr[] = {-1, 2, 3 , -4, 5, -7, 12, 14 ,-8 };
		int n = arr.length;
		
		Arrays.sort(arr);
		System.out.println("Arrays.sort(arr);");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println("");
		rearrange(arr, n);
		printArray(arr, n);
		
	}
		
	private static void printArray(int[] arr, int n) {
		// TODO Auto-generated method stub
		System.out.println("\nprintArray(arr, " + n + ")");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void rearrange(int arr[], int n) {
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
	}
	
}
