package common_questions;

public class SortSentance {

public static String sortSentence(String s) {
        
        String []str=s.split(" ");
        String f="";
        for(int i=0;i<str.length-1;i++)
        {
            for(int j=0;j<str.length-1-i;j++)
            {
                String fnum=str[j].substring(str[j].length()-1);
                int fnum_int=Integer.parseInt(fnum);
                String snum=str[j+1].substring(str[j+1].length()-1);
                int snum_int=Integer.parseInt(snum);
                if(fnum_int>snum_int)
                {
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
        }
        
        for(int i=0;i<str.length;i++)
        {
            f=f+str[i].substring(0,str[i].length()-1);
            f+=" ";
        }
        String m=f.trim();
        return m;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "is2 sentence4 This1 a3";
		String t=sortSentence(s);
		System.out.println(t);
	}

}
