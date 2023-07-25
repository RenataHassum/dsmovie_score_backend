### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com

# Sobre o projeto DSMovie Score | Hateoas [![NPM](https://img.shields.io/npm/l/react)](https://github.com/RenataHassum/dsmovie_score_backend/blob/main/LICENSE) 

DSMovie é um projeto backend para busca de filmes, onde é possível avaliá-los e atualizar automaticamente as médias das avaliações. Desenvolvido com o framework Spring Boot durante a semana Java Spring oferecida pela instituição de ensino <a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a>

O projeto segue o padrão de arquitetura em camadas, com CRUD completo e tratamento de exceções. Além disso, utiliza o padrão HATEOAS para fornecer links úteis nos endpoints, facilitando a navegação e interação com a API.

# Teste as requisições no Postman Collection
#### Siga o passo a passo:
1) Faça o clone do projeto
```bash
# Pré-requisitos: Java 17
# clonar repositório
git clone git@github.com:RenataHassum/dsmovie_score_backend.git

# entrar na pasta do projeto back end
cd dsmovie_score_backend
cd backend

# executar o projeto
./mvnw spring-boot:run
```
2) Clique no botão "Run in Postman"
3) Acesse a opção "View collection"
4) Teste as requisições conforme orientações abaixo
   
      [![Run in Postman](https://run.pstmn.io/button.svg)](https://app.getpostman.com/run-collection/22138191-1c67c35c-78e3-4b5f-819e-913105d82b80?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D22138191-1c67c35c-78e3-4b5f-819e-913105d82b80%26entityType%3Dcollection%26workspaceId%3D3a218287-4551-4766-8924-9f150058dd36)

#### Não é necessário realizar a configuração de ambiente do projeto

## Movies endpoints
`GET Movie list paged`
- Retorna uma lista paginada completa dos filmes

`GET Movie by ID`
- Retorna as informações de um filme específico com base no seu ID

`PUT Score`
- Permite avaliar um filme específico com base no seu ID. Após a avaliação, a média das avaliações é atualizada automaticamente

`POST New Movie`
- Permite inserir um novo filme

`PUT Update Movie`
- Permite atualizar informações de um filme específico com base no seu ID

`DELETE Delete Movie`
- Permite deletar um filme específico com base no seu ID

# Tecnologias | Implantação em produção
- Java, Spring Boot, API REST, JPA, Hibernate, Maven, H2 Database, PostgreSQL, ORM, Git, Hateoas
- Implantação Backend: Até o presente momento, o projeto não conta com a implementação no backend em uma plataforma de hospedagem
- Implantação banco de dados: Postgresql

# Técnicas | Competências
- Programação Orientada a Objetos (POO) e Seed de Banco de Dados: Permite o desenvolvimento eficiente de um sistema orientado a objetos e a criação de um modelo conceitual representando entidades e relacionamentos.
- Arquitetura em Camadas: Utiliza uma estrutura organizada em camadas, proporcionando separação clara de responsabilidades e facilitando a manutenibilidade do sistema.
- Web Services RESTful: Implementa web services RESTful, seguindo o padrão DTO para transferência de dados.
- Operações CRUD completas: Realiza as operações completas de Criar, Ler, Atualizar, Excluir e Procurar.
- Tratamento de Exceções: Implementa mecanismos de tratamento de exceções, garantindo mensagens de erro claras para os usuários.
- Paginação de Dados: Implementa técnicas de paginação para otimizar o desempenho e viabilizar a navegação eficiente em conjuntos de dados extensos.
- HATEOAS: Implementação de links e recursos relacionados para APIs RESTful, facilitando a interação com os clientes ao fornecer links úteis nos endpoints, o que torna a navegação e interação com a API mais simples e intuitiva.

## Figma Frontend
https://www.figma.com/file/hpQuzpGHq2MmrI87xnfMoT/DSMovie1?type=design&node-id=0-1&mode=design&t=LYSvngLsGDJk41GM-0

## Modelo conceitual
![Modelo Conceitual](https://github.com/RenataHassum/assets/blob/main/dsmovie_score_assets/modelo_dominio.png?raw=true)

## Padrão camadas
![Padrão camadas](https://github.com/RenataHassum/assets/blob/main/padrao_camadas.jpg?raw=true)

# Agradecimentos
<a href="https://devsuperior.com.br/cursos"><img align="center" height="16" alt="DevSuperior" src="https://devsuperior.com.br/_next/static/images/logo-white-10059e26f600604a7b5bd7782ed7550c.svg"></a> - Professor Nélio Alves

# Autora
### Renata Hassum - [Linkedin](https://www.linkedin.com/in/renataviottohassumdev) | renatahassum@gmail.com
Fico à disposição para qualquer esclarecimento, não hesite em me contatar
