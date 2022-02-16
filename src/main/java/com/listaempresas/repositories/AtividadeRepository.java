package com.listaempresas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.listaempresas.domain.RamoDeAtividade;

@Repository
public interface AtividadeRepository extends JpaRepository<RamoDeAtividade, Integer>{

	
	
}
