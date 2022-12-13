package Vista;
import Utilidades.*;
public class Menus{  
	 public static void muestraMenu() {
		 System.out.println("");
	        System.out.println("@---------------------------@");
	        System.out.println("|            MENU            |");
	        System.out.println("|----------------------------|");
	        System.out.println("|Elige una opcion:           |");
	        System.out.println("| 1.Introducir articulos     |");
	        System.out.println("| 2.Modificar articulo       |");
	        System.out.println("| 3.Borrar articulo          |");
	        System.out.println("| 4.Salir                    |");
	        System.out.println("@---------------------------@");
	        System.out.println("");
	 }
	 
 public static  int introduceOpcion() {
	 
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>5)){
			System.out.println("Debe de introducir un opción valida");
			valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 public static void modificar() {
	 System.out.println("");
     System.out.println("@---------------------------@");
     System.out.println("|       MENU MODIFICAR       |");
     System.out.println("|----------------------------|");
     System.out.println("|Elige una opcion:           |");
     System.out.println("| 1.Modifica el nombre       |");
     System.out.println("| 2.Modifica la cantidad     |");
     System.out.println("| 3.Modifica el precio       |");
     System.out.println("| 4.Modifica la descripcion  |");
     System.out.println("@---------------------------@");
     System.out.println("");
 }
 public static int chooseOpcion() {
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>4)){
			System.out.println("Debe de introducir un opción valida");
			valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 public static void valModificar() {
	 System.out.println("¿Está seguro de que quiere realizar los cambios efectuadoss?");
	 System.out.println("1.Si");
	 System.out.println("2.No");
 }
 public static int chooseOption() {
	 int opcion=-1;
	 boolean valido=false;
	 do {
		 valido=false;
		 opcion=Introducir.leeEntero("Elige una opcion");
		 if((opcion<1)||(opcion>2)) {
			 System.out.println("Debe de introducir una opcion valida");
			 valido=true;
		 }
	 }while(valido);
	 return opcion;
 }
 }
