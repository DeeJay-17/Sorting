package package_1;
//
//public class BubbleSort {
//
//	public static void main(String[] args) {
//		int arr[] = {20, 10, 50, 30, 60, 40};
//		for (int i = 0; i < 5; i++) {
//		System.out.println(arr[i]);
//		}
//	}
//}

class BubbleSort {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {20, 10, 50, 30, 60, 40};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}