package com.listaempresas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.listaempresas.domain.Empresa;
import com.listaempresas.domain.RamoDeAtividade;
import com.listaempresas.repositories.AtividadeRepository;
import com.listaempresas.repositories.EmpresaRepository;

@SpringBootApplication
public class BackendListaEmpresasSpringbootApplication implements CommandLineRunner{

	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BackendListaEmpresasSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		RamoDeAtividade atividade1 = new RamoDeAtividade(null, "Tecnologia", "Desenvolvimento de Software");
		
		Empresa empresa1 = new Empresa(null, "AllanTech LTDA", "Inovação e Tecnologia", atividade1);
		
		atividade1.getEmpresas().addAll(Arrays.asList(empresa1));
	
		this.atividadeRepository.saveAll(Arrays.asList(atividade1));
		this.empresaRepository.saveAll(Arrays.asList(empresa1));
	}

}
