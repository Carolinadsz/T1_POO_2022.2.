package principal;
import java.util.Scanner;
public class questão8 {

	public static void main(String[] args) {
		// 8°QUESTÃO: Faça um programa que apresente o menu de opções a seguir, permita ao usuário escolher a opç desejada, receba os dados necessários para executar a operação e mostre o resultado. Verifique a p sibilidade de opção inválida e não se preocupe com restrições do tipo salário inválid
		int op, con; float imp, aum, sal, novsal;

		Scanner sc = new Scanner(System.in);
		do{

		System.out.println("--------------------------------------------");
		System.out.println("Menu de Opções:");
		System.out.println("\t1-Imposto");
		System.out.println("\t2-Novo Salário");
		System.out.println("\t3-Classificaçao");
		System.out.println("\t4-Sair do Programa");
		System.out.println("Digite a operação desejada:");
		op = sc.nextInt();


		 if (op > 4 || op < 1){
		System.out.println("\nOPÇÃO INVALIDA");
		}
		switch(op){

		case 1:
		System.out.println("\nDIGITE SEU SALÁRIO: ");
		sal = sc.nextFloat();
		if (sal < 500){
		imp = sal * 5/100;
		System.out.println("O IMPOSTO SERÁ " + imp);

		}
		if (sal >= 500 && sal <= 850){
		imp = sal * 10/100;
		System.out.println("O IMPOSTO SERÁ " + imp);

		}
		if (sal > 850){
		imp = sal * 15/100;
		System.out.println("O IMPOSTO SERÁ CERCA DE: " + imp);
		 }
		break;

		case 2:
		System.out.println("\nDIGITE SEU SALÁRIO: ");
		sal = sc.nextFloat();
		if (sal > 1500){
		aum = 25; novsal = sal + 25;
		System.out.println("SEU NOVO SALÁRIO É DE: "+ novsal + " REAIS");

		}
		if (sal >= 750 && sal <= 1500){
		aum = 50; novsal = sal + aum;
		System.out.println("SEU NOVO SALÁRIO É DE: "+ novsal + " REAIS");

		}
		if (sal <= 750 && sal >= 450){
		aum = 75; novsal = sal + aum;
		System.out.println("SEU NOVO SALÁRIO É DE: "+ novsal + " REAIS");

		}
		if (sal < 450){
		aum = 100; novsal = sal + aum;
		System.out.println("SEU NOVO SALÁRIO É DE: "+ novsal + " REAIS");
		 }

		break;
		case 3:
		System.out.println("\nDIGITE SEU SALÁRIO: ");
		sal = sc.nextFloat();
		if (sal <= 700){
		System.out.println("\nMAL REMUNERADO!");

		} else{
		System.out.println("\nBEM REMUNERADO!");

		}
		break;
		case 4:
		System.out.println("\nFIM DO PROGRAMA!!");
		break;

		 }
		System.out.println("\nVocê deseja Refazer o Programa?: [1] caso SIM e [2] caso NÃO");
		con = sc.nextInt();
		 }while(con == 1);


	}

}
