import java.util.Scanner;

public class ExistenciasAlmacen {
	public static void main(String []args){
		int e=3200, e2;
		while(e>=100){
			System.out.println("Selecciona el número de existencias a pedir");
			Scanner sc=new Scanner (System.in);
			e2=sc.nextInt();
			e=e-e2;
		}
		System.out.println("No existen existencias disponibles");
	}
}
