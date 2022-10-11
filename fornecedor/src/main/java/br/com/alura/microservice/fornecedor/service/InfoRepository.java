package br.com.alura.microservice.fornecedor.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado); //Spring ja vai criar toda a estrutura de consulta no bd apenas utilizando a convenção do nome do método
	
}
