package principal;
import java.util.Scanner;
public class questão3 {

	public static void main(String[] args) {
		// 3° QUESTÃO: Faça um programa para resolver equações do 2°grau
        Scanner entrada = new Scanner (System.in);
        double a, b, c, delta, x1, x2;
        System.out.println("Digite o valor a: " );
        a = entrada.nextDouble();
        System.out.println("Digite o valor b: " );
        b = entrada.nextDouble();
        System.out.println("Digite o valor c: " );
        c = entrada.nextDouble();
        delta = b*b - 4*a*c;
        
        if(delta >= 0) {
        	x1 = (b + Math.sqrt(delta))/(2*a);
        	x2 = (b + Math.sqrt(delta))/(2*a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        }
        else
        	System.out.println("Não é possível calcular");
        }
	}  


