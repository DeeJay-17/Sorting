package package_1;

import java.util.*;
public class New_Sort {

	public static void main(String[] args) {
		int[] arr = {20, 10, 50, 30, 60, 40};
        Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
	}

}
