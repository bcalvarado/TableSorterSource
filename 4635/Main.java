import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	static Scanner scnr = new Scanner(System.in);

	public static void main(String[] args) throws FileNotFoundException, IOException, Exception {
		String fileName = "";
		
		System.out.println("Enter filename (Example: table.txt)");
		fileName = scnr.toString();
		
		Table table = Table.GetTable(fileName);	
		
		if (!TableSorter.isSortedTF(table)) {
			TableSorter.sortable(table);
		}

	}

}
