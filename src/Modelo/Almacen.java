package Modelo;

public class Almacen {
	public String nombre;
	public String direccion;
	public String telefono;
	public int superficie = 0;
	private Articulos [] misArticulos;
	public Almacen() {
		
	}
	
	public Almacen (String nombre, String direccion, String telefono, int superficie,int tamaño) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.superficie = superficie;
		this.misArticulos = new Articulos[tamaño];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	


	public Articulos[] getMisArticulos() {
		return misArticulos;
	}

	public void setMisArticulos(Articulos[] misArticulos) {
		this.misArticulos = misArticulos;
	}

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", superficie="
				+ superficie + "]";
	}
	
	/**
	 * Aquí controlamos la el tamaño del array que debe tener
	 * @return el tamaño del array
	 */
	public int tamañoArray() {
		int tamaño=0;
		for(int i = 0; i < misArticulos.lenght; i++) {
			if(misArticulos[i]!=null) {
				tamaño++;
			}
		}
		return tamaño;
	}
	
	
	/**
	 * Busca una zona vacía dentro del array y una vez encontrada la iguala las direccioones de memoria
	 * @param a Artículo a introducir
	 * @return Hace que interrumpa el for
	 */
	public boolean insertaArticulo(Articulo a) {
		boolean result = false;
		if(a!=null && tamañoArray()<tamaño) {
			for(int i = 0; i < misArticulos.lenght && !result; i++) {
				if(misArticulos[i]==null) {
					misEstudiantes[i]=a;
					result = true;
				}
			}
		}
	}
	
	/**
	 * Devuelve el articulo que coincide con el codigo de dicho artículo
	 * @param codArticulo: el codigo que se va a buscar
	 * @return: Devuelve el articulo o null si no está
	 */
	public Articulos muestraPorCodigo(String codArticulo) {
		Estudiante a = null;
		if(misArticulos!=null && tamañoArray() > 0) {
			for(int i = 0; i < misArticulos.length && e == null; i++) {
				if(misArticulos[i].getCodArticulo().equeals(codArticulo)) {
					a = misArticulos[i];
				}
			}
		}
		return a;
	}
	
	
	
	
	
	
	
}
