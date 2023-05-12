# Sistema de Cadastro de Alunos
Esse projeto consiste em um sistema básico de CRUD (Create, Read, Update, Delete) em Java, utilizando o paradigma de Programação Orientada a Objetos (POO), para cadastrar alunos em uma escola.

## Funcionalidades
O sistema permite realizar as seguintes operações:

- **Cadastro de Aluno** : permite cadastrar um novo aluno, informando nome, matrícula, curso e período.
- **Listagem de Alunos**: exibe a lista de todos os alunos cadastrados, com suas informações.
- **Atualização de Aluno**: permite atualizar as informações de um aluno já cadastrado.
- **Exclusão de Aluno **: permite excluir um aluno cadastrado.
## Estrutura do Projeto
O projeto é composto pelos seguintes pacotes:

- `model`: contém a definição da classe `Aluno`, responsável por armazenar as informações dos alunos.
- `dao`: contém a interface `AlunoDAO` e a classe `AlunoDAOImpl`, responsáveis pela persistência dos dados dos alunos.
- `view`: contém as classes responsáveis pela interface gráfica do usuário, incluindo as telas de cadastro, listagem, atualização e exclusão de alunos.
- `controller`: contém as classes responsáveis pela comunicação entre a interface gráfica e as classes do modelo e de persistência.
## Como Executar o Projeto
Para executar o projeto, basta clonar o repositório e importá-lo em sua IDE de preferência. Em seguida, execute a classe `Main.java` localizada no pacote `view`.

O sistema será iniciado e a tela principal será exibida. A partir daí, é possível utilizar todas as funcionalidades do sistema.

## Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias:

- Java 8
- Swing (para a interface gráfica)
- Maven (para gerenciamento de dependências)
## Autor
Esse projeto foi desenvolvido por Eric, como parte de um estudo sobre Programação Orientada a Objetos em Java.
