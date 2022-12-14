package Controlador;

import Modelo.Articulos;

import Utilidades.Introducir;

<<<<<<< HEAD
=======

>>>>>>> 2d16974438654ffead9ad9bd672c9a6f3ada88aa
import Vista.Menu;

public class control {
	  /**
	   * Funcion para realizar las diferentes opciones del men� principal
	   * 
	   * @param E1 Objeto de la Clase Empleado para modificar sus par�metros
	   * @param op La opcion del men� elegida
	   */
	public static void menuPrincipal(Articulos A1,int op) {
		switch(op) {
			case 1:
				
				System.out.println("");
				System.out.println("");
				
				break;
			
			case 2:
				
				System.out.println("");
				System.out.println("");
				Menu.menuIntroducir();
				modificarArticulos(A1);
				break;
				
			case 3:
				
				System.out.println("");
				System.out.println("");
				break;
				
			case 4:
				
				System.out.println("");
				System.out.println("");
		        break;
		        
		    default:
		    	
		    	break;
		}
	}
<<<<<<< HEAD
	public static void modificarArticulos(Articulos A){
		
		boolean salir = false;
		Menu.menuSiNo("¿Quieres modificar articulos?");
		
		while(!salir) {
			if(Menu.chooseSiNo()==1) {
				switch(Menu.chooseOpcion()) {
					case 1:
						
						A.setNombre(Introducir.leeString("Introduce el nombre del artículo: "));
						System.out.println(A);
						break;
						
					case 2:

						A.setUnidades(Introducir.leeEntero("Introducela cantidad de artículos: "));
						System.out.println(A);
						break;
						
					case 3:
						
						A.setPrecio(Introducir.leeFloat("Introduce el precio del artículo: "));
						System.out.println(A);
						break;
						
					case 4:

						A.setNombre(Introducir.leeString("Introduce el nombre del artículo: "));
						System.out.println(A);
						break;
						
					default:
						
						System.out.println("Introduce una opción valida");
						break;
				}
			}else {
				salir=true;
			}
		}
	}
	public static void crearArticulos() {
		
		Menu.menuSiNo("¿Quieres crear un nuevo articulo?");
		
		if(Menu.chooseSiNo()==1) {
			
=======
	public static void IntroducirArticulos(int op){

		boolean salir = false;
		Menu.opcionSiNo("¿Quieres introducir nuevos articulos?");
		Introducir.leeEntero("");
		while(!salir) {
			switch(op) { 
				case 1:
					
				break;	
				case 2:
					
				break;
				case 3:
					
				break;
				case 4:
					
				break;
				default:
					System.out.println("Introduce una opción valida");
				break;
			}

		
		Menu.opcionSiNo("¿Quieres introducir nuevos articulos?");
		
		switch(op) {
		case 1:
			
		break;
		
		case 2:
			
			
			break;
		case 3:
			
			break;
		case 4:
			
	        break;
	        
	    default:
	    	
	    	break;

>>>>>>> 2d16974438654ffead9ad9bd672c9a6f3ada88aa
		}
	}
}