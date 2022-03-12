package week3day2;

import java.util.HashSet;

public class FindInsrtnUsngColl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={0,8,2,4,3,1},b={1,3,5,7,9};
		HashSet <Integer> s1 = new HashSet <Integer>();
	    HashSet <Integer> s2 = new HashSet <Integer>();
	    for(int i:a) {
			   s1.add(i);
			    }
	   System.out.println(s1);
	   for(int j:b) {
		   s2.add(j);
	   }
        System.out.println(s2);
        s1.retainAll(s2);
        System.out.println("Intersection = "+ s1);
	}

}
