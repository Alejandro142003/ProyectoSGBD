package Modelo;

import java.util.Objects;

public class Articulos {
	public int codArticulo = 1;
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
<<<<<<< HEAD
		return "Codigo de Articulo: "+codArticulo + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", unidades=" + unidades + ", precio=" + precio + "\n";
=======
		return "Articulos [codArticulos=" + codArticulos + ", nombre=" + nombre + ", Unidad=" + Unidad + "]";
>>>>>>> cc3ee70a63b774bcc4516433b1483fa1e17fa33a
	}

	@Override
	public int hashCode() {
		return Objects.hash(codArticulo, descripcion, nombre, precio, unidades);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Articulos other = (Articulos) obj;
		return codArticulo == other.codArticulo && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio)
				&& unidades == other.unidades;
	}
	
	

}

