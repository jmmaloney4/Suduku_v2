package suduku;

import static suduku.util.print;

import java.io.File;

public class Suduku {

	public static void main(String[] args) {
		if (args.length < 1) {
			print("Error: Needs an argument\n");
			System.exit(1);
		}
		
		Puzzle p = new Puzzle("530070000600195000098000060800060003400803001700020006060000280000419005000080079");
		
		
	}

}
