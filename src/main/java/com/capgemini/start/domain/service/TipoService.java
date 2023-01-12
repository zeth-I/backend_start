package com.capgemini.start.domain.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.capgemini.start.domain.entity.Tipo;
import com.capgemini.start.domain.repository.TipoRepository;
import com.capgemini.start.domain.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TipoService {
	
	private final TipoRepository repository;
	
	public List<Tipo> findAll() {
		return repository.findAll();
	}
	
	public Tipo findById(Long id){
		return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Tipo não encontrado"));
	}
	

}
