package PraticeJava;

public class Array2 {

	public static void main(String[] args) {
   int[] a= {1,2,3,4,5};
    int SumEven=0;
    int SumOdd=0;
   for(int x:a) {
	   if(x%2==0) {
		   SumEven++;
		   
	   }else {
		   SumOdd++;
	   }
	   
   }System.out.println("Even="+SumEven);
   System.out.println("Odd= "+SumOdd);
   
	}

}
