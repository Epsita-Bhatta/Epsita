package PraticeJava;
import java.util.Arrays;
public class SortedArray {
	public static void main(String[] args) {
		int[] arr= {100,20,30,400,50};
		System.out.println("Before sorting :");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(arr));
	}

}
