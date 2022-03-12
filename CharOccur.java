package week3day2;

public class CharOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to the world of journey ";
		int c = 0;
		char[] CArray = s.toCharArray();
		int length = CArray.length;
		System.out.println("Length of Array is :  "+length);
		for (int i = 0; i < length; i++) {
			if ('w' == CArray[i]) {
				c++;
			}
		}
		System.out.println(c);
	}
	}


