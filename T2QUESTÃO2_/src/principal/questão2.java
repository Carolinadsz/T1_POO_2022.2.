package principal;
import java.util.Scanner;
public class questão2 {

	public static void main(String[] args) {
		//  QUESTÃO 2 Faça um programa que mostre o menu de opções a seguir, receba a opção do usuário e os dados ncessários prara executar cada operação:
        double num1, num2, soma;
        System.out.println("MENU");
        System.out.println("------------------------------------");
        System.out.println("[1]somar dois números");
        System.out.println("[2]Raiz quadrada de um número");
        System.out.println("------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma das opções: ");
        double op = sc.nextDouble();
        if(op == 1) {
        	System.out.println("Digite o primeiro número: ");
        	num1 = sc.nextDouble();
        	System.out.println("Digite o segundo número: ");
        	num2 = sc.nextDouble();
        	soma = num1 + num2;
        	System.out.println("A soma entre o primeiro e o segundo número é:" + soma);
        }
        else if(op == 2) {
        	System.out.println("Digite um valor: ");
            num1 = sc.nextDouble();
            double raiz = Math.sqrt(num1);
            System.out.println("A raiz deste valor é:" + raiz);
            
        }
        else {
        	System.out.println("Tente novamente!");
        }

	}

}
