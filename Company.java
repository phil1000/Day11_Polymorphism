public class Company {

	public void launch() {
		int[] myIntegers = {1,3,2,77,86,99,14};
		double[] myDoubles = {1.1,3.1,2.2,77.7,86.4,99,9,14.2};
		
		DoubleLinkedList<IntegerNode> myIntegerList = new ItemLinkedList<Integer>();
				
		for (int i=0; i<myIntegers.length; i++) {
			Integer myInt = new Integer(myIntegers[i]);
			myIntegerList.addItem(myInt);
		}
		
		myIntegerList.printListfromStart();
		myIntegerList.printListfromEnd();
		
		Integer newInt = myIntegerList.findItem(1);
		if (newInt!=null) {
			System.out.println("found " + newInt.getValue());
			myIntegerList.deleteItem(newInt); 
		}

		myIntegerList.printListfromStart();
		myIntegerList.printListfromEnd();
	}
	
	public static void main(String[] args) {
		Company Company = new Company();
		Company.launch();
	}
}