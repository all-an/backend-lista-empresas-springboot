package com.listaempresas.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listaempresas.domain.RamoDeAtividade;
import com.listaempresas.repositories.AtividadeRepository;

@Service
public class AtividadeService {

	@Autowired
	private AtividadeRepository repository;
	
	public RamoDeAtividade findById(Integer id) {
		Optional<RamoDeAtividade> obj = repository.findById(id);
		return obj.orElse(null);
	}
	
}
