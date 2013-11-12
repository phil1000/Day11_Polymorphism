public interface ListNode {
	void setNext(ListNode nextNode);
	void setPrior(ListNode priorNode);
	ListNode getNext();
	ListNode getPrior();
	V getValue();
}