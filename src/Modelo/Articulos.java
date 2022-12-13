package Modelo;

public class Articulos {
	public int codArticulos = 0;
	public String nombre;
	public int Unidad = 0;
	public int prueba = 0;

	public Articulos() {

	}

	public Articulos(int codArticulos, String nombre, int unidad) {
		this.codArticulos = codArticulos;
		this.nombre = nombre;
		Unidad = unidad;
	}

	public int getCodArticulos() {
		return codArticulos;
	}

	public void setCodArticulos(int codArticulos) {
		this.codArticulos = codArticulos;
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
		return "Articulos [codArticulos=" + codArticulos + ", nombre=" + nombre + ", Unidad=" + Unidad + "]";
	}

}
