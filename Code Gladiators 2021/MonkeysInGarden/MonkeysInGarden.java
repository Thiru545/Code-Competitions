
public class MonkeysInGarden {
	public static int monkey(int input1[]) {
		int Path = 0, tPath = 0;
		for (int i = 0; i < input1.length; i++) {
			for (int j = 0; j < i/* input1.length */; j++) {
				int distance = (input1.length - i + j) < (i - j) ? (input1.length - i + j) : (i - j);
				tPath = input1[i] + input1[j] + distance;
				System.out.print("Distance Between trees at " + (j+1)+ " AND " + (i+1) + " : " + distance);
				System.out.println("->> tPath: " + tPath);
				Path = tPath > Path ? tPath : Path;
			}
		}

		return Path;

	}

	public static void main(String[] args) {
		int[] array = { 1,2,3,4 };
		System.out.println(monkey(array));
	}

}
