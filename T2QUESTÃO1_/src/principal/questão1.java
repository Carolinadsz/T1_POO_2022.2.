package principal;
import java.util.Scanner;
public class questão1 {

	public static void main(String[] args) {
		 // 1°QUESTÃO: Faça um programa que receba um número inteiro e verifique se é par ou impar
			Scanner ler = new Scanner(System.in);
			int n;
			System.out.print("Digite um número: ");
			 n = ler.nextInt();
			
			System.out.println();
			if ((n % 2) == 0) 
		        System.out.printf("%d é um numero \"par\" . \n", n);
		     if ((n % 2) == 1) 
				System.out.printf("%d é um numero \"impar\".\n", n);

	}}
