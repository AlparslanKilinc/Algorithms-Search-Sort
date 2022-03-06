package algs;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		int [] arr = {2,5,67,12,5,1};
		
		Sorts sort = new Sorts();
		
		 
		sort.Heapsort(arr);
		
		
		System.out.println(Arrays.toString(arr));

	}

}
