package com;

public class Test
{
	public static void main(String[] args)
	{
		Pelicula peli = new Pelicula("Transformer 5", 100, "5:00 PM");
		System.out.println(peli.toString());
		
		Asiento silla = new Asiento('A',1);
		System.out.println(silla.toString());
		
	}
}
