package weekFourJava;


public class Main {

	public static void main(String[] args) {
		String s = "abcab";
		String t = "";
		
		for (int i = 0; i < s.length(); i++) {
			if (t.contains(s.substring(i,i+1)) == false) {
				t += s.charAt(i);
			}
		
		}
	    System.out.println(t); 
	    
		
	}

}
