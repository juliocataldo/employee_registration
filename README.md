# Desafio faculdade

Criação de uma aplicação web para realizar o cadastro de funcionários.

Projeto com implementação de um CRUD com banco de dados
utilizando Jdbc Template, Spring Boot, Spring MVC e Gradle.

## Instalação

Acesse a seção de downloads do Gradle e clique no link gradle-x-x-x-bin.zip (binaries only) e descompacte o .zip baixado em seu computador.

Crie uma variável de ambiente GRADLE_HOME. O valor da variável será o diretório onde o Gradle foi descompactado. Exemplo: C:\gradle-2.2.1.

Valide a instalação do Gradle abrindo o Prompt de Comando e digitando o comando abaixo, que caso o Gradle tenha sido configurado corretamente, deve imprimir informações à respeito de sua versão:

```bash
gradle -v
```

Saída
```bash
------------------------------------------------------------
Gradle 2.2.1
------------------------------------------------------------
 
Build time:   2014-11-24 09:45:35 UTC
Build number: none
Revision:     6fcb59c06f43a4e6b1bcb401f7686a8601a1fb4a
 
Groovy:       2.3.6
Ant:          Apache Ant(TM) version 1.9.3 compiled on December 23 2013
JVM:          1.8.0_20 (Oracle Corporation 25.20-b23)
OS:           Windows 7 6.1 amd64
```
### Benefícios Gardle
Acesse o link abaixo onde é mostrado maior performance, flexibilidade e a experiência do usuário

https://gradle.org/maven-vs-gradle/

## Inicialização 
Importar o projeto como Existing Gradle Projects.

Para executar a classe EmployeesBootApplication:
- Clique com o botão direito em cima dela.
- Run As > Java Application


 Quando criamos o projeto, solicitamos a dependência de JDBC. O Spring
Boot necessita das configurações básicas para conectar ao banco da faculdade!
- Acesse o arquivo application.properties na pasta src/main/resources e
adicione as configurações:

```bash
spring.datasource.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
spring.datasource.username=MEU_USUARIO
spring.datasource.password=MINHA_SENHA
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver
```


Agora inicie e acesse: http://localhost:8080/fiap/employees

### Imagem da JSP inicial

[![View-Employees.png](https://i.postimg.cc/tJVS1zNM/View-Employees.png)](https://postimg.cc/7JwMd0c3)

## MER 
#### Modelo entidade relacionamento
[![Relacionamento-banco.png](https://i.postimg.cc/V6X4mNfx/Relacionamento-banco.png)](https://postimg.cc/VrLXFmbg)