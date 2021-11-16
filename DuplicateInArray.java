package common_questions;

import java.util.ArrayList;
import java.util.HashMap;

public class DuplicateInArray {
	
	 public static boolean containsDuplicate(int[] nums) {
	        
	        ArrayList Al=new ArrayList();
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            if(Al.contains(nums[i]))
	            {
	                return true;
	            }
	            else
	            	Al.add(nums[i]);
	        }
	       
	        
	        return false;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []x= {1,2,3,4};
		boolean n=containsDuplicate(x);
		System.out.println(n);
		
		
	}

}
