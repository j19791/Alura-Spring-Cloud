package br.com.alura.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;

public class CompraService {

	public void realizaCompra(CompraDTO compra) {

		RestTemplate cliente = new RestTemplate();
		ResponseEntity<InfoFornecedorDTO> exchange 
			= cliente.exchange("http://localhost:8081/info/" + compra.getEndereco().getEstado()
				, HttpMethod.GET
				, null
				, InfoFornecedorDTO.class);
		
		
	}

	
	
	
}
