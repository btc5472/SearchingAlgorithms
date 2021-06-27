/**************************
Brandon Cobb
October 7, 2017
C182 Computer Architecture
**************************/

class Test2{
	public static void main (String[] args){
		
		SortArray obj = new SortArray();
		obj.selectionSort();
		System.out.println("\nOriginal:" + obj.s + "\nSelection Sorted:" + obj);

		String s = "   1 9 45 3 14 76 23  ";
		SortArray obj2 = new SortArray(s);
		obj.bubbleSort();
		System.out.println("\nOriginal:" + obj2.s + "\nBubble Sorted:" + obj2);
		
		int[] n = {81, 34, 83, 56, 12, 22, 17};
		SortArray obj3 = new SortArray(n);
		obj.insertionSort();
		System.out.println("\nOriginal:" + obj3.s + "\nInsertion Sorted:" + obj3);
	}
}