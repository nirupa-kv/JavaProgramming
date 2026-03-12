package JavaLab;
import java.util.*;
public class CaseInsensitivePalindrome {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        String code=new String();
	        System.out.println("Enter the String: ");
	        code=sc.next();
	        System.out.println(isAlphabeticPalindrome(code));
	    }
	    public static boolean isAlphabeticPalindrome(String code) {
	        String clean=code.toLowerCase();
	        StringBuffer s=new StringBuffer(clean);
	        String str=s.reverse().toString();
	        StringBuffer s1=new StringBuffer();
	        StringBuffer s2=new StringBuffer(); 
	        int n=s.length();
	        for(int i=0;i<n;i++){
	            if(Character.isLetter(clean.charAt(i))){
	                s1.append(clean.charAt(i));
	            }
	        }
	        for(int j=0;j<n;j++){
	            if(Character.isLetter(str.charAt(j))){
	                s2.append(str.charAt(j));
	            }
	        }
	        if(s1.toString().equals(s2.toString()))
	            return true;
	        else
	            return false;
	    }
}