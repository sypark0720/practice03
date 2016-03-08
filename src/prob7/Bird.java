package prob7;

public abstract class Bird {
	//field
	private String name;
	private int legs;
	private int length;
	
	//getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	//method
	//abstract method
	public abstract void fly();
	public abstract void sing();
	
}
