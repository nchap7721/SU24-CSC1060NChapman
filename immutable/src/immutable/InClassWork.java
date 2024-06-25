package immutable;

public class InClassWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		String myst = "extra";
		String str1 = "hi";
		String str2 = "bye";
		char[] first = new char[100];
		char[] second = new char[100];
		char[] third = new char[100];
		System.out.println(justChecking(str1, str2));
		lessMore(str1, str2, result);
		wordLong(str1);
		itTakesTwo(str1, myst);
		
		
	}
	
	public static void myFillString(char[] first,char[] second,char[] last) {
		
	}

	public static boolean justChecking(String str1, String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
	
	public static void lessMore(String str1, String str2, int result){
		result = 1;
		if(str1.charAt(0) == str2.charAt(0)) {
			result = 0;
		}
		if(str1.charAt(0) > str2.charAt(0)) {
			result = -1;
		}
		System.out.println("your result is " + result);
	}
	
	public static void wordLong(String str1) {
		int howL = str1.length();
		System.out.println("your word is " + howL + " letters long");
	}
	
	public static void itTakesTwo(String str1, String myst) {
		System.out.println(str1 + myst);
	}

}
