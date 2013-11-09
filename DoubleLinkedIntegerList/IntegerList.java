public class IntegerList {

	private Integer startofList=null;
	private Integer endofList=null;
	
	public void addInteger(Integer newInteger) {
		if (startofList==null) {
			startofList=newInteger;
		} else {
			newInteger.setPrior(endofList);
			endofList.setNext(newInteger);
		}
		endofList=newInteger;
	}
	
	public void printListfromStart() {
		Integer listIterator = startofList;
		while (listIterator!=null) {
			System.out.println(listIterator.getValue());
			listIterator=listIterator.getNext();
		}
	}
	
	public void printListfromEnd() {
		Integer listIterator = endofList;
		while (listIterator!=null) {
			System.out.println(listIterator.getValue());
			listIterator=listIterator.getPrior();
		}
	}
	
	public Integer findInteger(int value) {
		// to be honest, don't really need this method and could just delete based on the int value
		// but have it just to show I can find something
		Integer intToReturn=null;
		Integer listIterator = startofList;
		
		while (listIterator!=null) {
			if (value==listIterator.getValue()) {
				// found it
				intToReturn=listIterator;
			}
			listIterator=listIterator.getNext();
		}
		
		return intToReturn;
	}

	public void deleteInteger(Integer intToDelete) {
		
		if (startofList.getValue()==intToDelete.getValue()) {
			// we want to delete first item in the list;
			startofList=startofList.getNext();
			startofList.setPrior(null);
			return;
		}
		
		Integer listIterator = startofList;
		
		while (listIterator.getNext()!=null) {
			if (intToDelete.getValue()==listIterator.getNext().getValue()) {
				// delete the next item
				listIterator.setNext(listIterator.getNext().getNext());
				listIterator.getNext().setPrior(listIterator);
				break;
			}
			listIterator=listIterator.getNext();
		}
	}
}