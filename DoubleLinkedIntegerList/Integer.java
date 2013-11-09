public class Integer {
	private int value;
	private Integer priorInteger;
	private Integer nextInteger;
	
	public Integer(int value) {
		this.value=value;
		this.priorInteger=null;
		this.nextInteger=null;
	}
	
	public void setNext(Integer nextInteger) {
		this.nextInteger=nextInteger;
	}
	
	public void setPrior(Integer priorInteger) {
		this.priorInteger=priorInteger;
	}
	
	public Integer getNext() {
		return this.nextInteger;
	}
	
	public Integer getPrior() {
		return this.priorInteger;
	}
	
	public int getValue() {
		return this.value;
	}
}