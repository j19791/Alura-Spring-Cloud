# Microservices com Spring Cloud: Registry, Config Server e Distributed Tracing

- perfomance
- gestão das configurações: como encontram de forma automatica
- logs - auditoria
- gestão de transações bd
- expor ms na internet
- autenticação e autorização : stateless



### Quebrando o domínio em serviços (contextos menores - bounded context)
- Conhecendo o domínio
- ms é a interpretação de um contexto: separação da modelagem da nossa aplicação em contextos coesos e independentes uns dos outros
	-  Cada contexto da nossa modelagem possui necessidades específicas e sua independência do resto da aplicação induz ao baixo acoplamento. Com isso, temos mais facilidade de lidar com questões técnicas, que são fortemente influenciadas pelos requisitos funcionais e não funcionais do negócio que estamos informatizando.
	- floricultura
		- loja
			- pedido de compra: usuário passa o endereço de destino e o que esta comprando
				- requisição
					post: /compra
						- itens [array]: id, quantidade
						- endereço (destino) : rua, numero, estado
						```json
						{	
							"items":[
								{"id": "1",
								"quantidade" : "3"}
								,
								{
								"id":"2",
								"quantidade" : "4"
									}],
							"endereco":{
								"rua":"Jose",
								"numero": "10",
								"estado" : "SP"
							}							
						}						
						```
			- Spring Web Starter 
		- fornecedor
		- transportador
		- catalogo de produtos por estado
		- selecionao produto
		loja fornecedor
		- reserva de transporte melhor tipo de transporte para o pedido: devolve o voucher


- comunicação entre serviços

- ambiente e versões
	- MariaDB com HeidSQL (cliente)
	- spring.io
		- Spring Cloud
	- Spring Tools 4 for Eclipse


### Service Registry com Eureka

### Spring Config Server

### Load Balancer e Spring Feign
- load balancer de requisições

### Distributed Tracing e Spring Sleuth




# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.12/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.12/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.12/reference/htmlsingle/#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

