package sayiBulma;

public class Main {

	public static void main(String[] args) {
		int[] sayilar = new int[] { 2, 4, 5, 6, 8, 3 };
		int aranacak = 7;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		} else {
			System.out.println("Sayı mevcut değildir.");
		}

	}
}
