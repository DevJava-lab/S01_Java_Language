package Exercici2;

public class Main {
	
	public static void main(String[] args) {
		
		Persona persona=new Persona("Manuel","Castillo",25);
		 String paraula = "genèrics";
		int numero=3;

		GenericMethods.imprimir(persona, paraula, numero);
		System.out.println("\n");
		GenericMethods.imprimir("Lola","cotxe",14);
		System.out.println("\n");
		GenericMethods.imprimir( 19,20,persona);
		System.out.println("\n");
		GenericMethods.imprimir(persona, new Persona("Juan","Gutierrez",28),"Estudiant");
		
	}
}
