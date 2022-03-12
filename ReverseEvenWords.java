package week3day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = "i am from POLLACHI";
		System.out.println(t);
		String[] split = t.split(" ");
		String r = " ",v=" ";
		int i,j;
		for ( i = 0; i < split.length; i++) {
			if (i % 2 != 0) {
			
				char[] evenword = split[i].toCharArray();
				for ( j = evenword.length - 1; j > 0; j--) {
					v = v + evenword[j];
				}
				r = r + " " + v;
			} else {
				r = r + " " + split[i];
			}
		}
		System.out.println(r);
	
	}

}
