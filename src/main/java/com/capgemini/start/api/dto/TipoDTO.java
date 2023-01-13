package com.capgemini.start.api.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDTO {
	
	private Long id;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAlteracao;

}