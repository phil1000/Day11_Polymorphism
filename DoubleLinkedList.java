public interface DoubleLinkedList<L extends Node> {
	void addItem(L newItem);
	void printListfromStart();
	void printListfromEnd();
	//L findItem(V value);
	void deleteItem(L itemToDelete);
}