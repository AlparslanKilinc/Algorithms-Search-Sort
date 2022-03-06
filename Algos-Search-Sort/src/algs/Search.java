package algs;

public class Search {
	
	public Search() {
		
	}
	
public String LinearSearchForValue(int value,int[]arr) {
		
		boolean valueInArray = false;
		String indexWithValue="";
	
		System.out.println("The Value was found in the Following Indecies:");
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==value) {
				valueInArray=true;
				indexWithValue+= i+" ";
			}
		}
		
		if(!valueInArray) {
			indexWithValue ="None";
			
		}
		System.out.println(indexWithValue);
		return indexWithValue;
		
	}

	
	public void binarySearchforValue(int value,int[]arr) {
		int lowIndex=0;
		int highIndex=arr.length-1;
		
		while(lowIndex<=highIndex) {
			int middleIndex=(highIndex+lowIndex)/2;
			
			if(arr[middleIndex]<value) lowIndex=middleIndex+1;
			else if(arr[middleIndex]>value) highIndex=middleIndex-1;
				
			else { ///found
				System.out.println("\nFound a Match for "+value+" at Index: "+middleIndex);
				break;
			}
			
		}
			
	}
	
	
	
	
	
	
	
	
	
	

}
