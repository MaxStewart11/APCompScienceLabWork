
public class Toy {

	String name;
	int count;

	public Toy(String n) {
		name = n;
		count = 1;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public int setCount(int n) {
		return n;
	}
	
	public String toString() {
		return name + " " + count;
	}
	
	
}
