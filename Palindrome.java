package week3day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "hai",t1="level";
	     String rev = " ";
	     int i,j;
	     for ( i = text.length()-1; i >= 0; i--)
	     {
		    rev = rev + text.charAt(i);
		     if(text.equals(rev))
		     {
		    	 System.out.println(text +" is a Palindrome ");
		     }}
		    
	for(j=t1.length()-1;j>=0;j--) {rev=rev + t1.charAt(j);
	if(t1.equals(rev));{System.out.println(t1 +"is a palindrome");
	}}
	 System.out.println(text +" is not Palindrome");
     
}}