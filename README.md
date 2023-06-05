# **Cardápio** - API RESTful

Esta é uma API RESTful desenvolvida em Java utilizando o framework Spring Boot. Ela permite listar e cadastrar refeições em um cardápio, com informações como título, preço e imagem. Os dados são armazenados em um banco de dados PostgreSQL.

## **Funcionalidades**

* Listar refeições: **GET** `http://localhost:8080/food` - _Retorna todas as refeições cadastradas no cardápio._
* Cadastrar refeição: **POST** `http://localhost:8080/food` - _Parâmetros:  **title**: título da refeição, **price**: preço da refeição, **image**: URL da imagem da refeição_

## **Configuração do Banco de Dados**

* Certifique-se de ter o PostgreSQL instalado e em execução.
* No `arquivo application.properties`, configure as informações de conexão com o banco de dados:
``` 
spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco_de_dados
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
``` 

## **Executando a API**

* Clone o repositório em sua máquina local.
* Abra o projeto em sua IDE preferida.
* Execute a classe principal `Application.java`.
* Acesse as rotas da API utilizando um cliente HTTP, como o Postman ou cURL.

## **Observações**

* As informações são enviadas e retornadas em formato JSON.
* Certifique-se de ter a dependência do PostgreSQL adicionada em seu arquivo `pom.xml`.
* Certifique-se de ter as anotações `@RestController`, `@GetMapping` e `@PostMapping` corretamente aplicadas aos métodos correspondentes.
* Personalize a lógica de negócio nos métodos do controller para atender às necessidades específicas da aplicação.
