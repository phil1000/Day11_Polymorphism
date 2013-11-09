public class IntegerNode {
	private int value;
	private IntegerNode priorIntegerNode;
	private IntegerNode nextIntegerNode;
	
	public IntegerNode(int value) {
		this.value=value;
		this.priorIntegerNode=null;
		this.nextIntegerNode=null;
	}
	
	public void setNext(IntegerNode nextIntegerNode) {
		this.nextIntegerNode=nextIntegerNode;
	}
	
	public void setPrior(IntegerNode priorIntegerNode) {
		this.priorIntegerNode=priorIntegerNode;
	}
	
	public IntegerNode getNext() {
		return this.nextIntegerNode;
	}
	
	public IntegerNode getPrior() {
		return this.priorIntegerNode;
	}
	
	public int getValue() {
		return this.value;
	}
}