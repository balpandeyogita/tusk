package capchademo2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		System.out.println("Captcha Members:");
		// for (int i = 0; i < 5; i++) {
		System.out.println(createCapchaValue());
		// }
	}

	private static String createCapchaValue() {
		Random random = new Random();
		int lenght = 7 + (Math.abs(random.nextInt()) % 3);
System.out.println( "length"+lenght);
		StringBuffer capchaStringBuffer = new StringBuffer();
		for (int i = 0; i < lenght; i++) {
			int baseCharacterNumber = Math.abs(random.nextInt()) % 62;
			System.out.println(baseCharacterNumber);
			int characterNumber = 0;
			if (baseCharacterNumber < 26) {
				characterNumber = 65 + baseCharacterNumber;
			} else if (baseCharacterNumber < 52) {
				characterNumber = 97 + (baseCharacterNumber - 26);
			} else {
				characterNumber = 48 + (baseCharacterNumber - 52);
			}
			capchaStringBuffer.append((char) characterNumber);
		}
		return capchaStringBuffer.toString();
	}

}
