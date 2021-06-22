package exam;

import java.util.Arrays;

public class ShiftElementsInArray {

  public void shift(int[] arr) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
	  int[] reverse=new int[arr.length];
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(i<(arr.length-1)) 
			  reverse[i+1]=arr[i];
		  else 
			  reverse[0]=arr[i];
	  }
	  
	  System.out.println(Arrays.toString(reverse));
  }

}
