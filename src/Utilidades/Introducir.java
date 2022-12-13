package Utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public static float leeFloat (String text) {
	boolean numeroCorrecto = false;
	Scanner teclado = new Scanner(System.in);
	float num = -1;
	
	do {
		try {
			System.out.print(text);
			num = Scanner.nextFloat();
			if (num < 0) {
				System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
				numeroCorrecto = true;
			}else {
				numeroCorrecto = false;
			}
		} catch (InputMismatchException ex) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		} catch (Exception e) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		}
	} while (numeroCorrecto = false);
	return num;
}

/**
 * Para devolver un int 
 */

public static int leeEntero(String text) {
	boolean numeroCorrecto = false;
	Scanner teclado = new Scanner(System.in);
	int num = -1;
	
	do {
		try {
			System.out.print(text);
			num = Scanner.nextInt();
			if (num < 0) {
				System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
				numeroCorrecto = true;
			}else {
				numeroCorrecto = false;
			}
		} catch (InputMismatchException ex) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		} catch (Exception e) {
			System.out.println("Ha introducido un número no válido, por favor introduzca uno correcto");
			teclado.nextLine();
			numeroCorrecto = true;
		}
	} while (numeroCorrecto = false);
	return num;
}

/**
 * Para devolver un String, el texto que recibe por teclado se imprime 
 * por pantalla.
 * 
 * @param text
 * @return String
 */

public static String leeString (String text){
    Scanner scan = new Scanner(System.in);
    String texto;

    System.out.print();
    texto = teclado.nextLine();

    return texto;
  }