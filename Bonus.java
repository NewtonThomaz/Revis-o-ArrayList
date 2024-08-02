package exemplos2407;
import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int carros = 0;
		System.out.println("Quantos carros vc vendeu na semana 1: "		);
		carros += ler.nextInt();
		System.out.println("Quantos carros vc vendeu na semana 2: ");
		carros += ler.nextInt();
		System.out.println("Quantos carros vc vendeu na semana 3: ");
		carros += ler.nextInt();
		System.out.println("Quantos carros vc vendeu na semana 4: ");
		carros += ler.nextInt();

		switch (carros) {
		case 1 :
			System.out.println("Sem Bonûs");
			break;
		case 2 :
			System.out.println("Sem Bonûs");
			break;
		case 3 :
			System.out.println("Sem Bonûs");
			break;
		case 4 :
			System.out.println("Sem Bonûs");
			break;
		case 5 :
			System.out.println("Sem Bonûs");
			break;
		case 6 :
			System.out.println("Sem Bonûs");
			break;
		case 7 :
			System.out.println("Sem Bonûs");
			break;
		case 8 :
			System.out.println("Sem Bonûs");
			break;
		case 9 :
			System.out.println("Sem Bonûs");
			break;
		case 10 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 11 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 12 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 13 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 14 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 15 :
			System.out.println("Bonûs de R$ 100,00");
			break;
		case 16 :
			System.out.println("Bonûs de R$ 300,00");
			break;
		case 17 :
			System.out.println("Bonûs de R$ 300,00");
			break;
		case 18 :
			System.out.println("Bonûs de R$ 300,00");
			break;
		case 19 :
			System.out.println("Bonûs de R$ 300,00");
			break;
		case 20:
			System.out.println("Bonûs de R$ 300,00");
			break;
		default:
			System.out.println("Bonûs de R$ 500,00");
		}
		ler.close();
	}
}