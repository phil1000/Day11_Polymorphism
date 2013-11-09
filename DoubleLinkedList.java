public interface DoubleLinkedList<T> {
	void addItem(T newItem);
	void printListfromStart();
	void printListfromEnd();
	T findItem(double value);
	void deleteItem(T itemToDelete);
}