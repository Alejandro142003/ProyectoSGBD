package Modelo;

public class Almacen {
	public String nombre;
	public String direccion;
	public String telefono;
	public int superficie = 0;
	public Almacen() {
		
	}
	
	public Almacen (String nombre, String direccion, String telefono, int superficie) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.superficie = superficie;
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

	@Override
	public String toString() {
		return "Almacen [nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", superficie="
				+ superficie + "]";
	}
	
	
	
}
