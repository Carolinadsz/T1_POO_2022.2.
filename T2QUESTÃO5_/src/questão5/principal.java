package questão5;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		// 5°QUESTÃO: Faça um programa que leia um número N que indica quantos valores inteiros e positivos devem ser lidos a seguir. Para cada número lido, mostre uma tabela contendo o valor lido e o fatorial desse valor
		int n, num, i, j, fat;
	    Scanner d;
	    d = new Scanner(System.in); 
	    
	    System.out.print("Digite a quantidade de numeros que serao lidos:");
	    n = d.nextInt();
	    
	    for(i=1; i<=n ; i++){
	       System.out.println("\n Digite o "+ i +"º número");
	          num = d.nextInt();
	          fat = 1 ;
	    for( j=1; j<=num ; j++ ){
	        fat = fat * j;
	       System.out.println("O Fatorial de "+ num +" = " + fat);
	}

}
	}}
