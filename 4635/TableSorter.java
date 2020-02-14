
public class TableSorter {
	public static int assignedCount;
	public static int comparedCount;
	public static int branchCount;
	public static int functionCalledCount;
	public static boolean isSorted;
	
	static void sortable(Table t) {
		functionCalledCount+=1;
		int tableSize = t.getSize();
		comparedCount+=1;
		assignedCount+=1;
		branchCount+=1;
		for (int i = 0; i < tableSize; i++) {
			comparedCount+=1;
			assignedCount+=1;
			branchCount+=1;
			for(int j = 0; j < tableSize - 1; j++) {
				assignedCount+=1;
				int minimum = j;
				comparedCount+=1;
				assignedCount+=1;
				branchCount+=1;
				for (int minNumFound = j; minNumFound < tableSize - 1; minNumFound++) {
					functionCalledCount+=2;
					comparedCount+=1;
					branchCount+=1;
					if (t.getTableValue(i, minimum) > t.getTableValue(i, minNumFound)) {
						assignedCount+=1;
						minimum = minNumFound;
					}
					comparedCount+=1;
					assignedCount+=1;
					branchCount+=1;
				}
				assignedCount+=1;
				functionCalledCount+=1;
				int tableValue = t.getTableValue(i, j);
				t.setTableValue(i, j, t.getTableValue(i, minimum));
				t.setTableValue(i, minimum, tableValue);
				comparedCount+=1;
				assignedCount+=1;
				branchCount+=1;
			}
		}
		isSorted = true;
	}
	
	
	public static boolean isSortedTF(Table t) {
		int tableSize = t.getSize();
		
		for (int i = 0; i < tableSize; i++) {
			for (int j = 0; j < tableSize - 1; j++) {
				int minimum = j;
				for (int minNumFound = j; minNumFound < tableSize - 1; ) {
					if(t.getTableValue(i, minimum) < t.getTableValue(i, minNumFound)) {
						return isSorted = true;
					}
				}
			}
		}
		return isSorted = false;
	}
	

}
