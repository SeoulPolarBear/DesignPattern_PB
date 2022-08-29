package Iterator;

public class Item {
	private String name;
	private int cost;
	
	
	public Item(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}
	
	@Override// toString 오버라이딩 다음과 같은걸 보여주기 위해서 
	public String toString() {
		return "(" + name + "," + cost + ")";
	}
	

}
