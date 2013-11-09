public class Comparator {
	// Method overloading - this class avoids repeating logic by calling the final getMax method using converted params
	// all the other 2 classes do is convert incoming params to the appropriate type (double) and 
	// then call the double getmax version with teh converted params
	public double getMax(int n1, int n2) {
		return getMax((double) n1, (double) n2); // will call the double method as the params are doubles
	}
	
	public double getMax(String n1, String n2) {
		return getMax(Double.parseDouble(n1), Double.parseDouble(n2)); // will call the double method as the params are converted to doubles
	}
	
	public double getMax(double n1, double n2) {
		if (n1>n2) return n1;
		else return n2;
	}
}