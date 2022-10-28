package com.tuempresa.vueloo.modelo;

import javax.persistence.*;

import lombok.*;

@Entity
@Getter @Setter
public class Tripulacion {
	
	@Id
	@Column(length = 20)
	String id;
	
	@Column(length = 50)
	String nombre;
	
	@ManyToOne
	(fetch = FetchType.LAZY, optional = true)
	Empleado empleado;

}
