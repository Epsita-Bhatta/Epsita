package Practicedaily;

public class RemoveJunk {
	public static void main(String[] args) {
		String s="$#%^$#^*^$# Epsita1234";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}

}
