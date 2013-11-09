public class CompareScript {

	public void launch() {
		//this script attempts to use polymorphism to get the
		// maximum of 2 different numbers provided as a double, string or integer
		// the class assumes input of a double so that we don't get any loss of precision
		// the alternative was to use an integer and cast the double to an integer but wouldn't have
		// been able to compare non whole numbers in that case
		
		Comparator compare = new Comparator();
		System.out.println("Max =" + compare.getMax(4.26, 4.33)); // compare doubles
		System.out.println("Max =" + compare.getMax(4, 3)); // compare integers
		System.out.println("Max =" + compare.getMax("4.89", "4.88")); // compare strings
	}
	
	public static void main(String[] args) {
		CompareScript newScript = new CompareScript();
		newScript.launch();
	}
}