package com.tuempresa.vueloo.modelo;

import javax.persistence.*;

import lombok.*;

@Embeddable
@Getter @Setter
public class Direccion {
	
	@Column(length = 20)
	String calle;
	
	@Column(length = 20)
	String colonia;
	
	@Column(length = 20)
	String ciudad;
	
	@Column(length = 20)
	String pais;

}
