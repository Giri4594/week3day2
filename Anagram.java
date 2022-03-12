package week3day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram ang = new Anagram();
		boolean isEqual = ang.isAnagramEqual("stops", "posts");
		System.out.println("the given text is Equal : "+isEqual);
	}
	
	private boolean isAnagramEqual(String t1, String t2) {
		int tx1lnth = t1.length();
		int tx2lnth = t2.length();
		if(tx1lnth != tx2lnth) {
			return false;
		}
		char[] txtarry1 = t1.toCharArray();
		char[] txtarry2 = t2.toCharArray();
		Arrays.sort(txtarry1);
		Arrays.sort(txtarry2);
		boolean isEqual = Arrays.equals(txtarry1, txtarry2);
		return isEqual;
	}
	}


