package weekone.day2;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "hello";
		char[] ch1 = str1.toCharArray();
		char[] rc = new char[ch1.length];

		for (int i = ch1.length - 1; i > -1; i--) {

			rc[ch1.length - 1 - i] = ch1[i];
		}

		System.out.println(rc);
	}
}