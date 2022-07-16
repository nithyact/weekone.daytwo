package weekone.day2;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "alagappa";
		char c = 'a';
		int counter = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == c) {
				counter++;
				
			}

			

		}
		System.out.println("the count is " + counter);

	}
}