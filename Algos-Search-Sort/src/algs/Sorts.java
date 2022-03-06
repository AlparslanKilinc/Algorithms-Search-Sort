package algs;

public class Sorts {
	
	 public Sorts() {
		 
	 }
	 
	 /// Heap Sort  
	 public void Heapsort(int arr[]) {
	      int n = arr.length;
	  
	      // Build max heap
	      for (int i = n / 2 - 1; i >= 0; i--) {
	    	  
	        heapify(arr, n, i);
	      }
	  
	      // Heap sort
	      for (int i = n - 1; i >= 0; i--) {
	        int temp = arr[0];
	        arr[0] = arr[i];
	        arr[i] = temp;
	  
	        // Heapify root element
	        heapify(arr, i, 0);
	      }
	    }
	 
	 void heapify(int arr[], int n, int i) {
	      // Find largest among root, left child and right child
	      int largest = i;
	      int l = 2 * i + 1;
	      int r = 2 * i + 2;  
	  
	      if (l < n && arr[l] > arr[largest])
	        largest = l;
	  
	      if (r < n && arr[r] > arr[largest])
	        largest = r;
	  
	      // Swap and continue heapifying if root is not largest
	      if (largest != i) {
	        int swap = arr[i];
	        arr[i] = arr[largest];
	        arr[largest] = swap;
	  
	        heapify(arr, n, largest);
	      }
	    }
	 
	 
	 
	 
	 ///// Quick Sort
	 public  int partition(int[] arr, int low, int high) {
		
		int pivot=arr[high];
		int partitionindex= low;
		
		
		for(int i=low; i<high; i++) {
			
			if(arr[i]<=pivot)
			{
				swap(i,partitionindex,arr);
				partitionindex++;
			}
		}
		
		swap(partitionindex,high,arr);
		return partitionindex;
	
	 }
		
		
	
	 public void quickSort(int[]arr, int low , int high) {
		
		 if(low<high) {
			 int pi=partition(arr,low,high);
			 quickSort(arr,low,pi-1);
			 quickSort(arr,pi+1,high);
		 }
		 
	
	 }
	 
	 
	/// Array Sorts 
	public void MergeSort(int[]arr) {
		int n = arr.length;
		if(n<2) return;
		
		int mid=n/2;
		int[] left = new int[mid];
		int[] right= new int[n-mid];
		
		for(int i=0; i<mid; i++) {
			left[i]=arr[i];
		}
		for(int i=mid; i<n; i++) {
			right[i-mid]=arr[i];
		}
			
		MergeSort(left);
		MergeSort(right);
		Merge(left,right,arr);
		
		
	}
	public void Merge(int[]L , int[]R, int[]A){
		int l=L.length;
		int r=R.length;
		int i=0;
		int j=0;
		int k=0;
		while(i<l && j<r) {
			if(L[i]<=R[j]) {
				A[k++]=L[i++];
			}else {
				A[k++]=R[j++];
			}
		}
		while(i<l) {
			A[k++]=L[i++];
		}
		while(j<r) {
			A[k++]=R[j++];
		}
		
	}
	public void InsertionSort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) 
			
		{
			int min=i;
			
		for(int j=i+1; j<arr.length; j++) 
		{	
			if(arr[j]<arr[min]) 
			{
					min=j;
			}
				swap(i,min,arr);	
		}	
		}
	}
	
	public void selectionSort(int [] arr) {
		for(int x=0; x<arr.length; x++) {
			int minimum=x;
			
			for(int y=x; y<arr.length; y++) {
				
				if(arr[minimum]>arr[y])  minimum=y;
			}
			swap(x,minimum , arr);
		}
		
	}
	
	public void bubbleSort(int[] arr) {
		
		for(int i= arr.length-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(arr[j]>arr[j+1]) {
					swap(j,j+1 , arr);
				}
				
			}
		}
	}
	
	/// Swap method 
	public void swap(int index1, int index2 , int[]arr) {
		int temp= arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		
	}
}
