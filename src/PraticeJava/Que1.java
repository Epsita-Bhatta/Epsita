package PraticeJava;
import java. util.Arrays;
public class Que1 {

	public static void main(String[] args) {
		int[] arr= {1,85,06,45,12,7};
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]>arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			
		}
	}
}System.out.println(Arrays.toString(arr));

String[] str= {"PHP","Java","Python"};
Char[] ch=str.toCharArray();
	}

}