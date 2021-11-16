import java.util.HashMap;

public class Anagram {

	public static void main(String[] args) {
		//  less time complexiblity
		String p="rat";
		String q="rat";
//		if(p.length()!=q.length())
//		{
//			System.out.println("not a anagram");
//		}
//		HashMap<Character, Integer> datamap1=new HashMap();
//		
//		for(int i=0;i<p.length();i++)
//		{
//			if(datamap1.containsKey(p.charAt(i)))
//			{
//				Integer value=datamap1.get(p.charAt(i));
//				value++;
//				datamap1.put(p.charAt(i), value);
//			}
//			else
//				datamap1.put(p.charAt(i),1);
//		}
//		
//		HashMap<Character, Integer> datamap2=new HashMap();
//		
//		for(int i=0;i<q.length();i++)
//		{
//			if(datamap2.containsKey(q.charAt(i)))
//			{
//				Integer value=datamap2.get(q.charAt(i));
//				value++;
//				datamap2.put(q.charAt(i), value);
//			}
//			else
//				datamap2.put(q.charAt(i),1);
//		}
//		boolean flag=false;
//		for(Character c:datamap1.keySet())
//		{
//			flag=false;
//			if(datamap1.get(c)!=datamap2.get(c))
//			{
//				break;
//			}
//			else
//				flag=true;
//		}
//		if(flag==true)
//		{
//			System.out.println("anagram");
//		}
//		else
//			System.out.println("not a anagram");
//		System.out.println(datamap1);
//		System.out.println(datamap2);
		
		//high time complexiblity
		
		if(p.length()!=q.length())
	    {
	        System.out.println("not anagram");
	    }
	    boolean flag1=false;
	    boolean visited[]=new boolean[q.length()];  
	        for(int i=0 ; i<p.length(); i++)
	        {
	            flag1=false; 
	            char c=p.charAt(i);
	            for(int j=0;j<q.length();j++)
	            {
	                if(q.charAt(j) == c && !visited[j])
	                {
	                    visited[j]=true;
	                    flag1=true;
	                    break;
	                }
	                
	               
	            }
	            if(flag1==false)
	            {
	                break;
	            }
	            
	                
	        }
	        
	        if(flag1==true)
	            {
	        	System.out.println("anagram");
	            }
	            else
	            {
	            	System.out.println("not anagram");
	            }

	}

}
