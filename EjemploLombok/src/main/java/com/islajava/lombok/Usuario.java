package com.islajava.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


public @AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode class Usuario {
	
	private String nickName;
	private String password;

}
