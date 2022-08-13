# exemplo-api-gestao-livros

Exemplo simples de API para gestão de livros realizando CRUD

## Funcionalidades

- Incluir novo livro: `POST /livros`
- Listar livros: `GET /livros`
- Detalhes do livro: `GET /livros/{id}`
- Alterar livro: `PUT /livros/{id}`
- Remover livro: `DELETE /livros/{id}`

## Dependências

- Java 11
- PostgreSQL 14
- Criar objetos de banco: `data/schema.sql`
- Carga inicial: `data/insert.sql`
- Arquivo do postman: `data/livro.postman_collection.json`
