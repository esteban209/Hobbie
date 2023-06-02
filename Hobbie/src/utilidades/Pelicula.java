package utilidades;


public class Pelicula {

	public String genero;
	public int año;
	public String nombre;
	
	public Pelicula() {
		this.genero=genero;
		this.año=año;
		this.nombre=nombre;
		
	}
	@Override
	public String toString() {
		return "Pelicula \t "+"Nombre:"+ nombre+"\t"+"Año de estreno:\t" +  año+"\t"+"Genero:\t"+ genero;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}