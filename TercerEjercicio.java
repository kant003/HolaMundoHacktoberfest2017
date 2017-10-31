import java.util.Scanner;

public class ConversorkmMillas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float MILLA=0.621371192f;		
		float resultado, km;
		System.out.println("Ingresa klometros");
		Scanner lector=new Scanner (System.in);
		km= lector.nextFloat();
		resultado=km*MILLA;
		System.out.println(km+" kms equivalen a "+resultado+" millas");	
	}

}