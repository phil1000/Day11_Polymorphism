public class Double {
	private double value;
	private Double priorDouble;
	private Double nextDouble;
	
	public Double(double value) {
		this.value=value;
		this.priorDouble=null;
		this.nextDouble=null;
	}
	
	public void setNext(Double nextDouble) {
		this.nextDouble=nextDouble;
	}
	
	public void setPrior(Double priorDouble) {
		this.priorDouble=priorDouble;
	}
	
	public Double getNext() {
		return this.nextDouble;
	}
	
	public Double getPrior() {
		return this.priorDouble;
	}
	
	public double getValue() {
		return this.value;
	}
}