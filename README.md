# 📚 Sistema de Gerenciamento de Biblioteca

Este é um projeto acadêmico desenvolvido para a disciplina de Programação Orientada a Objetos da **UNIFACISA**. O sistema permite gerenciar livros e revistas em uma biblioteca, utilizando os conceitos de **herança**, **polimorfismo**, **encapsulamento**, **classes abstratas**, **enum** e **ArrayList**.

## 🚀 Funcionalidades

- **Adicionar materiais** (livros ou revistas) com validação de dados.
- **Pesquisar material** por título.
- **Excluir material** por título.
- **Listar todos os materiais** cadastrados.
- **Feedback amigável** para cada operação (sucesso/erro).
- **Validações** robustas:
    - Título e autor não podem ficar em branco.
    - Tipo de material (1 – Livro / 2 – Revista) deve ser válido.
    - Gênero do livro deve ser escolhido entre as opções disponíveis.
    - Número da edição da revista deve ser positivo.
    - Pesquisa e exclusão exigem título não vazio.

## 🧱 Estrutura do Projeto

```
src/
└── sistema/
    ├── Main.java         # Interface com o usuário (menu)
    ├── Biblioteca.java   # Gerencia a coleção de materiais (ArrayList)
    ├── Material.java     # Classe abstrata base
    ├── Livro.java        # Subclasse de Material (atributo: gênero)
    ├── Revista.java      # Subclasse de Material (atributo: número)
    └── Genero.java       # Enum com os gêneros disponíveis
```

## 🛠️ Tecnologias Utilizadas

- **Java 17** (ou superior)
- **Git** para controle de versão
- **IntelliJ IDEA** (pode ser usado qualquer IDE)

## Como Executar

### 🐧 No Linux (ou WSL)

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/rubensnuness/Library-Manager.git
   ```
2. **Acesse a pasta do projeto**:
   ```bash
   cd Library-Manager/untitled/src
   ```
3. **Compile os arquivos Java**:
   ```bash
   javac sistema/*.java
   ```
4. **Execute o programa**:
   ```bash
   java sistema.Main
   ```
### 🪟 No Windows (com Git Bash ou Prompt)

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/rubensnuness/Library-Manager.git
   ```
2. **Navegue até a pasta do código**:
   ```bash
   cd Library-Manager\untitled\src
   ```
3. **Compile todos os arquivos**:
   ```bash
   javac sistema\*.java
   ```
4. **Execute**:
   ```bash
   java sistema.Main
   ```

### Alternativa (usando uma IDE)

Importe o projeto como um projeto Java existente em sua IDE (IntelliJ, Eclipse, VS Code) e execute a classe `Main.java` diretamente.

---


## 📌 Exemplo de Uso

    ----MENU----
    
    1) Adicionar material!
    2) Pesquisar material!
    3) Excluir material!
    4) Listar materiais!
    5) Sair do sistema!

### Ao adicionar um livro, o sistema solicitará título, autor e gênero (com opções numeradas). Para revistas, pedirá título, autor e número da edição.

## Validações Implementadas

- Impede cadastro com título ou autor vazio.
- Impede tipo de material inválido (diferente de 1 ou 2).
- Impede número de edição <= 0.
- Impede gênero não listado.
- Impede pesquisa ou exclusão com título vazio.

## 👤 Autor
Rubens Nunes – [GitHub](https://github.com/rubensnuness)

### Projeto desenvolvido como parte do curso de **Análise e Desenvolvimento de Sistemas** – UNIFACISA.