package PraticeJava;
import java.util.*;
public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		HashMap<Character,Integer> freqMap=new HashMap<Character,Integer>();
		char[] inputarray=str.toCharArray();
		for(char x:inputarray) {
			freqMap.put(x, freqMap.getOrDefault(x, 0)+1);
		}
		for(char c:freqMap.keySet()) {
			System.out.println(c +" "+freqMap.get(c));
		}
		

	}

}
