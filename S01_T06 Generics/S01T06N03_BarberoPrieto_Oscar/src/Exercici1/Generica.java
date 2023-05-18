package Exercici1;

public class Generica {

	public static <T> void imprimirTelefon(Telefon argument) {

		argument.trucar();

	}

	public static <T> void imprimirSmartphone(Smartphone argument) {

		argument.ferFotos();

	}

}
