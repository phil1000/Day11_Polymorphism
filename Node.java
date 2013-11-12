public class Node <V> {
	private V value;
	private Node priorNode;
	private Node nextNode;
	
	public Node(V value) {
		this.value=value;
		this.priorNode=null;
		this.nextNode=null;
	}
	
	public void setNext(Node nextNode) {
		this.nextNode=nextNode;
	}
	
	public void setPrior(Node priorNode) {
		this.priorNode=priorNode;
	}
	
	public Node getNext() {
		return this.nextNode;
	}
	
	public Node getPrior() {
		return this.priorNode;
	}
	
	public V getValue() {
		return this.value;
	}
}