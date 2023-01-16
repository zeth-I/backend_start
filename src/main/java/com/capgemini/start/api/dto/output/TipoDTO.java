package com.capgemini.start.api.dto.output;

import java.time.LocalDateTime;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(name = "Tipo", description = "Objeto de saída da entidade Tipo")
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class TipoDTO {
	
	private Long id;
	private String descricao;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataAlteracao;

}