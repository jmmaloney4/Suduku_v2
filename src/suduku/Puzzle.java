package suduku;

import java.io.File;

import static suduku.util.print;

public class Puzzle {

	Cell[] contents = new Cell[81];

	public Puzzle(String p) {

		if (p.length() != this.contents.length) {
			throw new RuntimeException("String Length is not correct"); 
		} else {
			for (int a = 0; a < this.contents.length; a++) {
				this.contents[a].value = Integer.parseInt(Character.toString(p.charAt(a)));
				print("contents[" + a + "] is equal to " + this.contents[a].value);
			}
		}
	}
}
