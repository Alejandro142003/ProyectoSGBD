package Controlador;

import Modelo.Articulos;
import Utilidades.Introducir;
import Vista.Menu;

public class control {
	  /**
	   * Funcion para realizar las diferentes opciones del men� principal
	   * 
	   * @param E1 Objeto de la Clase Empleado para modificar sus par�metros
	   * @param op La opcion del men� elegida
	   */
	public static void MenuPrincipal(Articulos A1,int op) {
		switch(op) {
			case 1:
				
				System.out.println("");
				System.out.println("");
				Menu.menuIntroducir();
				
				
			break;
			
			case 2:
				
				
				break;
			case 3:
				
				break;
			case 4:
				
		        break;
		        
		    default:
		    	
		    	break;
		}
	}
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
		}
	}
}