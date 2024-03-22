package testproject.testproject;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("print occurance of character count");
		String str = "vidyajadhav";
		char ca[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ca.length; i++) {
			if ('v' == ca[i]) {
				count++;
			}
		}

		System.out.println(count);
	}
}
