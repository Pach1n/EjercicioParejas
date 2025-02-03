package parejas;

import java.util.Scanner;

class Palabra {

	String termino;
	String definicion;
	
	
	
	
	Palabra(String termino, String definicion) {
		this.termino = termino;
		this.definicion = definicion;
	}

	public String getTermino() {
		return termino;
	}
	
	public void setTermino(String termino) {
		this.termino = termino;
	}
	
	public String getDefinicion() {
		return definicion;
	}
	
	public void setDefinicion(String definicion) {
		this.definicion = definicion;
	}

}








public class Ejparejas {
	
	
	public static void mostrarMenu() {
		
		System.out.println("1) Introducir un término y su definición");
		System.out.println("2) Mostar todos los términos (sin definiciones)");
		System.out.println("3) Obtener la definición de un término que el usuario introduzca");
		System.out.println("4) Eliminar un término y su definición");
		System.out.println("5) Salir");
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opc;
		int contadorPal = 0;
		Palabra[] diccionario = new Palabra[100];
		
		do {
			
			Ejparejas.mostrarMenu();
			opc = sc.nextInt();
			
			switch(opc) {
			
			case 1:
				
				System.out.println("Introduce un término");
				String term = sc.next();
				sc.nextLine();
				System.out.println("Introduce una definición para ese término");
				String def = sc.nextLine();
				diccionario[contadorPal] = new Palabra(term, def);
				contadorPal++;
				break;
				
			case 2:
				for(int i = 0; i < contadorPal; i++) {
					System.out.print(diccionario[i].getTermino());
					System.out.println();
				}
				
				
				
			
			
			}
			
			
			
			
			
			
			
			
			
		} while (opc != 5);
		
		
		
		

	}

} 