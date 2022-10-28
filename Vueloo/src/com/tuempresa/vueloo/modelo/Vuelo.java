package com.tuempresa.vueloo.modelo;

import java.time.*;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter
public class Vuelo {

	@Id
	@Column(length = 30)
	String id;
	
	@Column(length = 30)
	String origen;
	
	@Column(length = 30)
	String destino;
	
	@Column(length = 30)
	String hora;
	
	LocalDate fecha;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	Pasajero pasajero;
	
	@ManyToOne
	(fetch = FetchType.LAZY)
	Tripulacion tripulacion;
}