package weekone.day2;

class Findminmax {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		int[] set = { 34, 10, 20, 88, 44, 55, 87, 43 };
		int temp = set[0];
		int tempmin = set[0];

		for (int i = 0; i < set.length; i++) {
			if (set[i] > temp) {
				temp = set[i];

			}

			if (set[i] < tempmin) {
				tempmin = set[i];
			}

		}

		System.out.println("max no= " + temp);
		System.out.println("min no= " + tempmin);

	}

}
