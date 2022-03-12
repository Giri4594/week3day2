package week3day2;

public class FindType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t = " We!come to t#e wor!d of #@ppine$$ : 004 ";
		int l = 0, s = 0, n = 0, splchar = 0;
		char[] f = t.toCharArray();
		for (int k = 0; k < f.length; k++) {
			if (Character.isLetter(f[k])) {
				l++;
			} else if (Character.isDigit(f[k])) {
				n++;
			} else if (Character.isSpaceChar(f[k])) {
				s++;
			} else {
				splchar++;
			}
		}
		
		System.out.println("Letters in the given string is: " + l);
		System.out.println("Spaces in the given string is: " + s);
		System.out.println("Numbers in the given string is: " + n);
		System.out.println("SpecialCharcter in the given string is : " + splchar);

	}

}
