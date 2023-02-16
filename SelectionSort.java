
public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {10,80,30,90,40,50,70};
		
		
		
	       for(int i=0; i<arr.length-1; i++) {
	           int smallest = i;
	           for(int j=i+1; j<arr.length; j++) {
	               if(arr[j] < arr[smallest]) {
	                   smallest = j;
	               }
	           }
	          
	           int temp = arr[smallest];
	           arr[smallest] = arr[i];
	           arr[i] = temp;
	       }

		for(int i=0;i<arr.length;i++)
		{
    	  System.out.println(arr[i]);
	      }
	

	}
}
