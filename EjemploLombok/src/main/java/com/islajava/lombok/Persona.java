package com.islajava.lombok;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public @ToString @EqualsAndHashCode class Persona {

	private @Getter @Setter String nombre;
	private @Getter @Setter String apellidos;
	@ToString.Exclude @Getter @Setter private int edad;
}
