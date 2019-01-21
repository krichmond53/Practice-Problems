
public class CheckForSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is quite a day";
		String sub = "it";
		
		System.out.println("Does \"" + s + "\" contain \"" + sub + "\"?\t" + containsSubstring(s, sub));
	}
	
	public static Boolean containsSubstring(String str, String sub) {
		Boolean b = false;
		
		if (str.contains(sub)) {
			b = true;
		}
		
		return b;
	}

}
