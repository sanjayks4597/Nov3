package common_questions;

public class FindDiffranceInString {

	 public static char findTheDifference(String s, String ch) {
	        
         char ch1='m';
	        char f[]=ch.toCharArray();
	        String t="";
	        for(int i=0;i<f.length;i++)
	        {
	        	t=t+f[i];
	        }
	        boolean []visited=new boolean[f.length];
	        for(int i=0;i<s.length();i++)
	        {
	        	char c=s.charAt(i);
	            for(int j=0;j<f.length;j++)
	            {
	            	if(f[j]==c && visited[j]!=true)
	            	{
	            		visited[j]=true;
                        break;
	            	}
	            }
	            
	        }
	     
	        
	        for(int i=0;i<visited.length;i++)
	        {
	            if(visited[i]==false)
	            {
	               ch1= t.charAt(i); 
	            }
	        }
	        if(s.length()==0)
	        {
	            return t.charAt(t.length()-1);
	        }
	        return ch1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		String t = "abcde";
		char c=findTheDifference(s,t);
		System.out.println(c);

	}

}
