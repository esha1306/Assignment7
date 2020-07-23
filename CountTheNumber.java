import java.util.*;
import java.io.*;
import java.lang.*;
public abstract class CountTheNumber {

	public static int CountPalindrome(String s){
		int n = s.length();
		int result = 0;
		int [] sameChar = new int[n];
		for(int v = 0; v < n; v++) {
			sameChar[v] = 0;
		}
		int i = 0;
		while(i < n) {
			int sameCharCount = 1;
			int j = i + 1;
			while(j < n && s.charAt(i) == s.charAt(j)) {
				sameCharCount++;
				j++;
			}
			result += (sameCharCount * (sameCharCount + 1) / 2);
			sameChar[i] = sameCharCount;
			i = j;
		}
		for(int j = 1; j < n; j++) {
			if(s.charAt(j) == s.charAt(j - 1))
				sameChar[j] = sameChar[j -1];
			if(j > 0 && j <(n - 1) && (s.charAt(j - 1) == s.charAt(j + 1) && s.charAt(j) != s.charAt(j - 1)))
				result  += Math.min(sameChar[j - 1], sameChar[j + 1]);	
		}
		return result - n;
		
	}
		
	public static void main(String[] args) {
			String s = "akkabakka";
			System.out.println(CountPalindrome(s));
	    }
	}

//}
