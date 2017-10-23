import java.util.Scanner;
public class ejercicios {

	public static void main(String[] args) {
		
		final int SALIR = 0;
		final int PAR_POSITIVO = 1;
		final int NOTA_EXAMEN = 2;
		final int DIGITO_NUM_ENTERO = 3;
		final int SUMA_NUM_ENTERO = 4;
		final int MULTIPLOS_5 = 5;
		
		Scanner scan = new Scanner(System.in);
		int opcion;
		
		
		String numero;
		
		
		do{
			
			System.out.println("-------MENU-------");
			System.out.println(PAR_POSITIVO + "Si un numero es o no par positivo");
			System.out.println(NOTA_EXAMEN + "Notas del examen, aprobado, notable..");
			System.out.println(DIGITO_NUM_ENTERO + "Cuantos digitos tiene un numero entero");
			System.out.println(SUMA_NUM_ENTERO + "Suma de los digitos de un numero entero");
			System.out.println(MULTIPLOS_5 + "Multiplos del cinco entre el rango del 1 al 100");
			
			
			opcion = Integer.parseInt(scan.nextLine());
			
			
			switch(opcion){
			
			case PAR_POSITIVO:
				
				
			break;
			
			case  NOTA_EXAMEN:
				
			break;
			
			case DIGITO_NUM_ENTERO:
				
			break;
			
			case SUMA_NUM_ENTERO:
				
			break;
			
			case MULTIPLOS_5 :
				
			break;
			
			case SALIR:
				default:
					System.out.println("Opcion mal");
			break;
			
			}
			
		}while (opcion != SALIR);

	}

}
