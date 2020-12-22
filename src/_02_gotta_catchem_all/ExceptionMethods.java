package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide(double x, double y) {
		if(y == 0.0) {
			throw new IllegalArgumentException();
		}
		double returner = x/y;
		return returner;
	}
	

	public String reverseString(String lol) {
		String returner = "";
		if(lol.equals("")) {
			throw new IllegalStateException();
		}
		for(int i = lol.length(); i > 0; i--) {
			returner += lol.charAt(i);
		}
		return returner;
	}
}
