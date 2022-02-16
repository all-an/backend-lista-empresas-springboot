package com.listaempresas.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.listaempresas.domain.Empresa;
import com.listaempresas.domain.RamoDeAtividade;
import com.listaempresas.repositories.AtividadeRepository;
import com.listaempresas.repositories.EmpresaRepository;

@Service
public class DBService {
	
	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;

	public void instanciaBaseDeDados() {
		
		RamoDeAtividade atividade1 = new RamoDeAtividade(null, "Tecnologia", "Desenvolvimento de Software");
		RamoDeAtividade atividade2 = new RamoDeAtividade(null, "Logistica", "Logistica");
		RamoDeAtividade atividade3 = new RamoDeAtividade(null, "Turismo", "Viagens e Acomodações");
		
		Empresa empresa1 = new Empresa(null, "AllanTech LTDA", "Inovação e Tecnologia", atividade1);
		Empresa empresa2 = new Empresa(null, "ELRapido LTDA", "Empresa de Entregas", atividade1);
		Empresa empresa3 = new Empresa(null, "ALLViagens1 LTDA", "Empresa de Viagens", atividade1);
		Empresa empresa4 = new Empresa(null, "EDevGames1 LTDA", "Empresa de Games", atividade1);
		
		atividade1.getEmpresas().addAll(Arrays.asList(empresa1, empresa4));
		atividade2.getEmpresas().addAll(Arrays.asList(empresa2));
		atividade3.getEmpresas().addAll(Arrays.asList(empresa3));
	
		this.atividadeRepository.saveAll(Arrays.asList(atividade1, atividade2, atividade3));
		this.empresaRepository.saveAll(Arrays.asList(empresa1, empresa2, empresa3, empresa4));
	}
	
}
