public class ItemLinkedList<L extends Node> implements DoubleLinkedList<L extends Node> {

	private L startofList=null;
	private L endofList=null;
	
	public void addItem(L newItem) {
		if (startofList==null) {
			startofList=newItem;
		} else {
			newItem.setPrior(endofList);
			endofList.setNext(newItem);
		}
		endofList=newItem;
	}
	
	public void printListfromStart() {
		L listIterator = startofList;
		while (listIterator!=null) {
			System.out.println(listIterator.getValue());
			listIterator=listIterator.getNext();
		}
	}
	
	public void printListfromEnd() {
		L listIterator = endofList;
		while (listIterator!=null) {
			System.out.println(listIterator.getValue());
			listIterator=listIterator.getPrior();
		}
	}
	
	/*public L findItem(int value) {
		return findItem((double) value);
	}
	
	public L findItem(V value) {
		// to be honest, don't really need this method and could just delete based on the int value
		// but have it just to show I can find something
		L itemToReturn=null;
		L listIterator = startofList;
		
		while (listIterator!=null) {
			if (value==listIterator.getValue()) {
				// found it
				itemToReturn=listIterator;
			}
			listIterator=listIterator.getNext();
		}
		
		return itemToReturn;
	} */

	public void deleteItem(L itemToDelete) {
		
		if (startofList.getValue()==itemToDelete.getValue()) {
			// we want to delete first item in the list;
			startofList=startofList.getNext();
			startofList.setPrior(null);
			return;
		}
		
		L listIterator = startofList;
		
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