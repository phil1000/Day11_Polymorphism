public class IntegerScript {

	public void launch() {
		int[] myIntegers = {1,3,2,77,86,99,14,4,999,765,47,43};
		
		IntegerList myIntegerList = new IntegerList();
		
		for (int i=0; i<myIntegers.length; i++) {
			Integer myInt = new Integer(myIntegers[i]);
			myIntegerList.addInteger(myInt);
		}
		
		myIntegerList.printListfromStart();
		myIntegerList.printListfromEnd();
		
		Integer newInt = myIntegerList.findInteger(1);
		if (newInt!=null) {
			System.out.println("found " + newInt.getValue());
			myIntegerList.deleteInteger(newInt); 
		}

		myIntegerList.printListfromStart();
		myIntegerList.printListfromEnd();
	}
	
	public static void main(String[] args) {
		IntegerScript myIntegerScript = new IntegerScript();
		myIntegerScript.launch();
	}
}