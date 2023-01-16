package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.start.api.dto.input.TipoInputDTO;
import com.capgemini.start.api.dto.output.TipoDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Tipo", description = "Tipo de título")
public interface TipoResource {
	
	@Operation(summary = "Consulta um Tipo por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<TipoDTO> findById(@PathVariable Long id);
	
	@Operation(summary = "Lista todos os tipos")
	@GetMapping()
	ResponseEntity<List<TipoDTO>> findAll();
	
	@Operation(summary = "Insere um tipo")
	@PostMapping()
	ResponseEntity<TipoDTO> insert(@RequestBody @Valid TipoInputDTO tipo);
	
	@Operation(summary = "Atualiza um tipo")
	@PutMapping(value = "/{id}")
	ResponseEntity<TipoDTO> update(@PathVariable Long id, @RequestBody @Valid TipoInputDTO tipo);
	
	@Operation(summary = "Exclui um tipo pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@PathVariable Long id);

}
