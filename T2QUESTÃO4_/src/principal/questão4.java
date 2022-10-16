package principal;
import java.util.Calendar;
public class questão4 {

	public static void main(String[] args) {
		// 4° QUESTÃO: Faça um programa que ostre a data do sistema nos seguintes formatos: DD/MM/AAAA- mês por extenso e hora:minuto.
		int data,mes,ano,hora,min;
		  
		  Calendar cal = Calendar.getInstance();
		  data = cal.get(Calendar.DAY_OF_MONTH);
		  mes = cal.get(Calendar.MONTH)+1;
		  ano= cal.get(Calendar.YEAR);
		  hora = cal.get(Calendar.HOUR);
		  min = cal.get(Calendar.MINUTE);
		  
		  System.out.println("---------------------------------------------------");
		  System.out.println("Data atual: " + data + "/" + mes + "/" + ano + "\n" + hora + " horas e " + min + " minutos." );

		  switch(mes) {
		  case 1:
			  System.out.println("Janeiro");break;
		  case 2:
			  System.out.println("Fevereiro");break;
		  case 3:
			  System.out.println("Março");break;
		  case 4:
			  System.out.println("Abril");break;
		  case 5:
			  System.out.println("Maio");break;
		  case 6:
			  System.out.println("Junho");break;
		  case 7:
			  System.out.println("Julho");break;
		  case 8:
			  System.out.println("Agosto");break;
		  case 9:
			  System.out.println("Sembro");break;
		  case 10: 
			  System.out.println("Outubro");break;
		  case 11: 
			  System.out.println("Novembro");break;
		  case 12:
			  System.out.println("Dezembro");break;
			  
		  }
		  System.out.println("---------------------------------------------------");
		  }}
