package com.islajava.lombok;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder @Getter @Setter
public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
}
