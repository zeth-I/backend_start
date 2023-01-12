package com.capgemini.start.util;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.start.domain.entity.Tipo;
import com.capgemini.start.domain.repository.TipoRepository;

@Component
public class LoadData {
	
	@Autowired
	private TipoRepository tipoRepository;
	
	private void carregarTipos() {
		var filmes = new Tipo(null, "Filmes", new Date(), null);
		var series = new Tipo(null, "Series", new Date(), null);
		tipoRepository.saveAll(List.of(filmes, series));
	}
	
	@PostConstruct
	public void carregar() {
		carregarTipos();
	}

}
