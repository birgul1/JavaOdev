

public class Main {

	public static void main(String[] args) {
	
		char sonuc='F';

		switch (sonuc) {
		case 'A':
			System.out.println("Mükemmel: Algoritmadan Geçtiniz");
			break;

		case 'B':
			System.out.println("Çok Güzel: Algoritmadan Geçtiniz");
			break;

		case 'C':
			System.out.println("İyi geçtiniz: Algoritmadan Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil: Algoritmadan Sorumlu Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Algoritmadan kaldınız");
		}
	}
}
