
public class EjemploScope {
	public static void main(String[] args) {
		System.out.println("Hello Word");

		int edad = 21;
		int cantidadPersonas =2;
		
		boolean esPareja;
		if(cantidadPersonas > 1) {
			esPareja = true;
		} else {
			esPareja = false;
		}
		boolean puedeEntrar = edad >= 18 && esPareja;
		    System.out.println("El valor de la conticion es:" + esPareja);
		    
		if (edad >= 18 && esPareja == true) {
			System.out.println("Usted puede entrar");
		}

		else {
				System.out.println("Usted no esta permitido a entrar");
		}

		}

}
