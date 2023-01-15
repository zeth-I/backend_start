package com.capgemini.start.api.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.capgemini.start.api.dto.input.TipoInputDTO;
import com.capgemini.start.api.dto.output.TipoDTO;
import com.capgemini.start.domain.entity.Tipo;

@Component
@Mapper(componentModel = "spring")
public interface TipoMapper {

	TipoMapper INSTANCE = Mappers.getMapper(TipoMapper.class);

	TipoDTO toDTO(Tipo tipo);

	@Mapping(target = "id", ignore = true)
	@Mapping(target = "dataCriacao", ignore = true)
	@Mapping(target = "dataAlteracao", ignore = true)
	Tipo toEntity(TipoInputDTO tipo);

}