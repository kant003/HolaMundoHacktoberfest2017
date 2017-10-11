import java.util.Scanner;

public class Preguntar_edad {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		int edad;
		System.out.println("Inserte su edad.");
		edad = lector.nextInt();
		if(edad >= 18 ) {
			System.out.println("Puedes pasar, acceso concedido");
		}else {
			System.out.println("Acceso denegado. No puedes pasar");
		}
		System.out.println("Gracias por usar mi aplicacion.");
		System.out.println("FIN");
		lector.close();

	}

}
