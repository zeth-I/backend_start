package com.capgemini.start.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.start.api.dto.output.TipoDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Tipo de Título")
public interface TipoResource {
	
	@Operation(summary = "Consulta um Tipo por id")
	@GetMapping(value = "/{id}")
	ResponseEntity<TipoDTO> findById(@RequestParam Long id);
	
	@Operation(summary = "Lista todos os tipos")
	@GetMapping()
	ResponseEntity<List<TipoDTO>> findAll();
	
	@Operation(summary = "Insere um tipo")
	@PostMapping()
	ResponseEntity<TipoDTO> insert(@RequestBody @Valid TipoDTO tipo);
	
	@Operation(summary = "Atualiza um tipo")
	@PutMapping(value = "/{id}")
	ResponseEntity<TipoDTO> update(@RequestParam Long id, @RequestBody @Valid TipoDTO tipo);
	
	@Operation(summary = "Exclui um tipo pelo id")
	@DeleteMapping(value = "/{id}")
	ResponseEntity<Void> delete(@RequestParam Long id);

}
