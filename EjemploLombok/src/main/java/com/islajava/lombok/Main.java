package com.islajava.lombok;

public class Main {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setMarca("Renault");
		vehiculo.setModelo("Clío");
		
		Libro libro = Libro.builder().autor("Stephen King").titulo("I.T").build();
		
		Persona persona = new Persona();
		persona.setNombre("Juan");
		persona.setApellidos("Perez");
		System.out.println(persona);
	}

}
