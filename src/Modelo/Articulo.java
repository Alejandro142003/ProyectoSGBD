package Modelo;

public class Articulo {
	public int codArticulo = 0;
	public String nombre;
	public int Unidad = 0;
	public int prueba = 0;

	public Articulo() {

	}

	public Articulo(int codArticulo, String nombre, int unidad) {
		this.codArticulo = codArticulo;
		this.nombre = nombre;
		Unidad = unidad;
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

	public int getUnidad() {
		return Unidad;
	}

	public void setUnidad(int unidad) {
		Unidad = unidad;
	}

	@Override
	public String toString() {
		return "Articulo [codArticulo=" + codArticulo + ", nombre=" + nombre + ", Unidad=" + Unidad + "]";
	}

}
