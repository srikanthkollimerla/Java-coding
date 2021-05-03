/* Find if a given string is unique or not*/

import java.util.*;
class isUnique {
	
	public boolean check(String word)
		{
			int[] arr = new int[26];
			for(int i=0;i< word.length();i++)
			{
				char ch= word.charAt(i);
				int charAscii = (int)ch;
				
				if(charAscii > 96 && charAscii < 113)     //checks if the string contains only alphabets
				{
					arr[charAscii%97]+=1;
				}
				if (arr[charAscii%97] > 1)    //checks if there is any character already repeated to prevent further iteration.
				{
					return false;
				}
			}
			for(int i=0;i< 26;i++)
			{
				if(arr[i]>1)
					return false;
			}
			
			return true;
		}
		
		
	public static void main (String[] args)
	{
		isUnique test = new isUnique();
		System.out.println("input:abbbc: "+test.check("abbbc")+" another test input:abc : " + test.check("abc"));
		
	}
	
	
}
