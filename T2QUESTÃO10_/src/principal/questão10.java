package principal;

public class questão10 {

	public static void main(String[] args) {
		// 9°QUESTÃO: Faça um programa que mostre as tabuadas dos números de 1 ao 10.
        System.out.println("A seguir você terá acesso a tabuada dos números de 1 ao 10." + "\n" + "--------------------");
		
		for(int i = 1; i<=10;i++) {
			for (int j = 0; j<=10; j++){
			System.out.println (i+" x "+ j + " = " + i*j);
		     
		}
			System.out.println(" \n--------------------");
		}
	}

}
