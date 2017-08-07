package com;

public class Pelicula
{
	private String nombre;

	private int precio;
	private String hora;
	
	public Pelicula(String n, int p, String h)
	{
		nombre = n;
		setPrecio(p);
		hora = h;
	}
	
	public String toString()
	{
		return	"Pelicula: "+ nombre + "\nPrecio: "+ precio + "\nHora: " + hora; 
	}

	public int getPrecio()
	{
		return precio;
	}

	public void setPrecio(int precio)
	{
		this.precio = precio;
	}
	public String getNombre()
	{
		return nombre;
	}
	
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	
	public String getHora()
	{
		return hora;
	}
	
	public void setHora(String hora)
	{
		this.hora = hora;
	}
}
