package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class GeneroDTO {

	private Long id;
	private String descricao;
	private LocalDateTime dataInclusao;
	private LocalDateTime dataAlteracao;

}