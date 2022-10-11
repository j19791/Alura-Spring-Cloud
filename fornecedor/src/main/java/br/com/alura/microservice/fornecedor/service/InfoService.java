package br.com.alura.microservice.fornecedor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

@Service
public class InfoService {

	//acessar o bd
	@Autowired
	private InfoRepository infoRepository; 
	
	@RequestMapping("/{estado}")
	public  InfoFornecedor getInfoPorEstado(String estado) {
		return infoRepository.findByEstado(estado);
		
	}

	
	
}
