/**************************
Brandon Cobb
October 7, 2017
C182 Computer Architecture
**************************/

import java.util.Scanner;

public class SortArray{
	
	// Attribute
	String s;
	
	// Global Variable
	static int[] sA;
	
	//Constructors
	public SortArray(){
		s = readsc();
		s = s.trim();
		String[] strArray = s.split(" ");
		sA = toIntArray(strArray);
	}
	
	public SortArray(String s){
		this.s = s.trim();
		String[] strArray = this.s.split(" ");
		sA = toIntArray(strArray);
	}
	
	public SortArray(int[] Array){
		sA = Array;
		this.s = toString();
	}
	
	
	// Methods from this point down
	// Read input from user and store value in s
	public static String readsc(){
		Scanner sc = new Scanner(System.in);
		String s = null;
		
		System.out.println("Enter a string of integers separated by spaces");
		s = sc.nextLine(); //read line from keybaord

		return s;
	}
	
	// Convert all strings in strArray to ints in sA[]
	public static int[] toIntArray(String strArray[]){ //***Does String strArray[] make sense as parameters?***
		sA = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++){
			if(!strArray[i].equals("")){
				sA[i] = Integer.parseInt(strArray[i]);
			}
		}
		return sA;
	}
	
	// Convert int[] sA to String s
	public String toString(){
		s = "";
		for(int i = 0; i < sA.length; i++){
			s = s + sA[i];
			if (i != sA.length - 1)
				s = s + " ";
		}
		return s;
	}
	
	// Selection Sort
	public void selectionSort(){
		for(int i = 0; i < sA.length - 1; i++) {
			int iMin = i;	
			for (int j = i + 1; j < sA.length; j++)
				if (sA[j] < sA[iMin]) iMin = j;  
				
			int temp = sA[iMin]; 
			sA[iMin] = sA[i];
			sA[i] = temp;
		}
	}
	
	// Bubble Sort
	public void bubbleSort(){
		for (int i = 0; i <  sA.length - 1; i++){
			for (int j = 1; j <  sA.length - i; j++){ 
				if (sA[j-1] > sA[j]){ 
					int temp = sA[j-1];
					sA[j-1] = sA[j];
					sA[j] = temp;
				}
			}
		}
	}
	
	// Inserstion Sort
	public void insertionSort(){
		for (int i = 1; i < sA.length; i++){
			for(int j = i ; j > 0 ; j--){    
				if(sA[j] < sA[j-1]){
					int temp = sA[j-1];						 
					sA[j-1] = sA[j];
					sA[j] = temp;
				}
			}
		}
	}
}