package SortingAlgs;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int [] arr = {2,5,65,1,};
		
		Sorts sort = new Sorts();
		 
		sort.bubbleSort(arr); 
		
		System.out.println(Arrays.toString(arr));

	}

}
