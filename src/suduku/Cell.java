package suduku;

public class Cell {
	
	static final int UNKNOWN = -1; 
	
	public int value;
	
	public Cell() {
		this.value = -1;
	}
	
	public String toString() {
		return "Cell: " + this.value;
	}
}
