import java.util.Scanner;
public class PropuestaTresSeis {
	public static void main(String[] args) {
		int kmh;
		System.out.println("Escriba una velocidad en km/h");
		Scanner teclado=new Scanner(System.in);
		kmh=teclado.nextInt();
		int ms=(kmh*1000)/3600;
		System.out.println(kmh+" km/h es igual a "+ms+" m/s");
	}
}