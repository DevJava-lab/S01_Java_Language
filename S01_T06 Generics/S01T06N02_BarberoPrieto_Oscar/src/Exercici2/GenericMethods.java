package Exercici2;


public class GenericMethods {

	public static <T> void imprimir(T... argument) {

		for (T element : argument) {

			System.out.println(element);

		}
	}
}
