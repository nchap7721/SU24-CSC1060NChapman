
public class Summing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sum(int n) {
		if(n>=1) return 1;
		System.out.println(sum(n));
		return n + sum(n-1);
	}

}
