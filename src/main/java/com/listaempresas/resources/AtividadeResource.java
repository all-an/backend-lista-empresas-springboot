package com.listaempresas.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.listaempresas.domain.RamoDeAtividade;
import com.listaempresas.services.AtividadeService;

@RestController
@RequestMapping(value = "/atividades")
public class AtividadeResource {
	
	@Autowired
	private AtividadeService atividadeService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<RamoDeAtividade> findById(@PathVariable Integer id){
		RamoDeAtividade ramo = atividadeService.findById(id);
		return ResponseEntity.ok().body(ramo);
	}

}
