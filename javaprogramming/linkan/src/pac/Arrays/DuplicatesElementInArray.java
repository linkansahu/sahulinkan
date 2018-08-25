package pac.Arrays;

public class DuplicatesElementInArray {

	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,1,4,7,5,2};
		   int flag = 0;
		 
		      System.out.print("Non repeated elements are:");
		        int count = 0;
				for(int i = 0; i <=a.length-1; i++)
		        {
		         
					for(int j = 0; j <a.length; j++)
		            {
		                if(i != j)
		                {
		                    if(a[i] == a[j])
		                    {
		                        flag = 0;
		                        break;
		                    }
		                    else
		                    {
 		                        flag = 1;
		                        
		                    }
		                }
		            }
		            if(flag == 1)
		            {
		                count++;
		                System.out.print(a[i]+" ");
		            }
		        }
		        System.out.println("");
		        System.out.println("Number of non repeated elements are:"+count);
		    		    
	}

}
