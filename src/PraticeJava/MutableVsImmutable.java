package PraticeJava;
import java.util.Arrays;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
//		mutable
		int a[]= {50,80,10,45,67,89};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
//		immutable
		String s="Epsita";
		System.out.println(s);
		s=s.concat("Bhatta");
		System.out.println(s);
		
	}
	

}
