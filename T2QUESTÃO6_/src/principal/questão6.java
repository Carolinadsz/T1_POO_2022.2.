package principal;
import java.util.Scanner;
public class questão6 {

	public static void main(String[] args) {
		// 6°QUESTÃO: Faça um programa que receba um número inteiro maior que 1, verifique se o número fornecido é pri mo ou não e mostre uma mensagem de número primo ou de número não primo. Um número é primo quando é divisível apenas por 1 e por ele mesmo
		Scanner t = new Scanner(System.in);
		System.out.println("Digite um número maior ou igual a 1: ");
		int numero = 0;
		while(numero<1) {
			numero = t.nextInt();
		}
		
		boolean primo = true;
		for(int i=2; i < numero; i++) {
			if( numero % i == 0 ) {
				primo = false;
			}
		}
		
		if(primo) {
			System.out.println("Esse número é primo");
		} else {
			System.out.println("Esse número não é primo");
				}
	}

}
