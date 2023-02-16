import java.util.Scanner;

public class DuplicateArray {

	public static void main(String[] args) {
		
		 
		boolean flag=false,temp=false;
        int [] arr = new int [] {10, 20, 30, 40, 20, 70, 80, 80, 30};   
        Scanner scan=new Scanner(System.in);
		System.out.println("Enter the key to Checked Duplicate Element Found or Not !");
		int key=scan.nextInt();
		
		
        for(int i = 0; i < arr.length; i++)
        {  
            for( int j = i + 1; j < arr.length; j++)
            {   
                	
            	if(arr[i]==arr [j] && key==arr[i] ) 
            	{
                    System.out.println("Duplicate Element Found:" + arr[j] );  
                    flag=true;
                    break;
            	}
            
            }
            
         	
     }
        if( key==arr[0] || key==arr[3] || key==arr[5]   )
		{
			System.out.println("Duplicate Element Not Found!");
			flag=true;
		}
        
        else  if(flag==false ) 
        {
        	 System.out.println("Key Element Not Found!"); 
         }
          
}
}  
		


