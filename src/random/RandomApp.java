package random;

import java.util.Random;

public class RandomApp {

	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(50)+1;
		System.out.println("랜덤 숫자는 : " + a);

	}

}
