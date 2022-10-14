package br.com.alura.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.controller.dto.CompraDTO;
import br.com.alura.microservice.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate cliente;
	
	
	public void realizaCompra(CompraDTO compra) {//loja fazendo requisição para localizar o endereço do fornecedor

		//RestTemplate nao consegue resolver por si próprio o enderelo do fornecedor (url:porta) mesmo com o eureka
		/* RestTemplate cliente = new RestTemplate(); */
		ResponseEntity<InfoFornecedorDTO> exchange 
			= cliente.exchange("http://fornecedor/info/" + compra.getEndereco().getEstado()
				, HttpMethod.GET
				, null
				, InfoFornecedorDTO.class);
		
		
	}

	
	
	
}
