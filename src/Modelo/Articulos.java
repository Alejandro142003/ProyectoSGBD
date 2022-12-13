package Modelo;

public class Articulos {
	public int codArticulo = 0;
	public String nombre;
	public String descripcion;
	public int unidades = 0;
	public double precio = 0.0;
	public Articulos() {

	}

	public Articulos(int codArticulo, String nombre, String descripcion, int unidades, double precio) {
		this.codArticulo = codArticulo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidades = unidades;
		this.precio = precio;
	}
	
	public int getCodArticulo() {
		return codArticulo;
	}

	public void setCodArticulo(int codArticulo) {
		this.codArticulo = codArticulo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulos [codArticulos=" + codArticulo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", unidades=" + unidades + ", precio=" + precio + "]";
	}

}
