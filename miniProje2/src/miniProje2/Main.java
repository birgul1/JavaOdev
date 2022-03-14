package miniProje2;

public class Main {

	public static void main(String[] args) {
		char character = 'i';

		switch (character) {
		case 'a':
		case 'u':
		case 'o':
		case 'ı':
			System.out.println(character + " " + "Kalın sesli");
			break;
			default:
				System.out.println(character + " " +"İnce sesli");
		}

	}

}
