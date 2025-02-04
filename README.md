# API do site Manhuaçu Smart City

Esse projeto se trata de uma API para o site de promoções e busca da região de Manhuaçu

## Importações Utilizadas  
- **Node.js** - Ambiente de execução JavaScript  
- **Express** - Framework para aplicações web  
- **MongoDB** - Banco de dados
- **Mongoose** - Biblioteca para manipular os dados no MongoDB
- **Cors** e **Body-parser** - Ferramentas para manipular requisições

## Funcionalidades  
- Criar, listar e deletar empresas  
- Criar, listar e deletar produtos  
- Associar produtos a empresas  
- Buscar produtos por nome e descrição

# Rotas

## Empresas
<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/empresas</td>
    <td>Criar uma nova empresa</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/empresas</td>
    <td>Listar todas as empresas</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/api/empresas/:id</td>
    <td>Remover uma empresa</td>
  </tr>
</table>

## Produtos
<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/produtos</td>
    <td>Criar um novo produto</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/produtos</td>
    <td>Listar todos os produtos</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/produtos?pesquisa=pesquisa feita pelo usuário</td>
    <td>Buscar produtos por nome ou descrição</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/produtos/:id</td>
    <td>Obter um produto pelo ID</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/api/produtos/:id</td>
    <td>Remover um produto pelo ID</td>
  </tr>
</table>

## Associar Produto com Empresa
<table>
  <tr>
    <th>Método</th>
    <th>Rota</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/empresas/:id/produtos</td>
    <td>Associar um produto a uma empresa</td>
  </tr>
</table>

## Instruções de uso

Clone o repositório e instale as dependências:

```bash
