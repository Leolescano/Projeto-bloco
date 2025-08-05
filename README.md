# Projeto de Bloco - Sistema de Gestão de Clientes e Pedidos

Este é um projeto de exemplo desenvolvido como parte do "Projeto de Bloco". A aplicação demonstra a criação, manipulação e persistência de entidades de negócio (Clientes e Pedidos) utilizando arquivos CSV como meio de armazenamento. O objetivo é aplicar conceitos de Orientação a Objetos, manipulação de arquivos e uso de bibliotecas externas em Java.

## ✨ Funcionalidades Principais

- **Gestão de Clientes:** Criação de objetos `Cliente` e persistência em `clientes.csv`.
- **Gestão de Pedidos:** Criação de objetos `Pedido` e persistência em `pedidos.csv`.
- **Leitura e Escrita em CSV:** Um serviço genérico (`CsvService`) para serializar e desserializar listas de objetos de/para arquivos CSV.
- **Modelagem de Dados:** Uso de classes e enums para representar as entidades do sistema de forma clara e robusta.

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Maven** (para gerenciamento de dependências)
- **Lombok:** Para reduzir código boilerplate (getters, setters, construtores).
- **OpenCSV:** Para a manipulação (leitura e escrita) de arquivos CSV.

## ⚙️ Como Executar o Projeto

### Pré-requisitos

- JDK 17 ou superior instalado.
- Apache Maven instalado.
- Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code).

### Passos

1.  **Clone o repositório:**
    ```sh
    git clone <URL_DO_SEU_REPOSITORIO>
    cd projeto-bloco
    ```

2.  **Instale as dependências:**
    O Maven fará o download automático das dependências ao abrir o projeto na IDE. Se preferir, pode fazer via linha de comando:
    ```sh
    mvn clean install
    ```

3.  **Execute a aplicação:**
    Encontre a classe `app.Main` e execute o método `main()`. A execução irá:
    - Criar uma lista de clientes e pedidos em memória.
    - Gerar os arquivos `clientes.csv` e `pedidos.csv` na raiz do projeto.
    - Ler os dados dos arquivos CSV recém-criados.
    - Imprimir os objetos lidos no console.

## 📂 Estrutura do Projeto

```
.
├── .gitignore         # Arquivos e diretórios ignorados pelo Git
├── pom.xml            # Arquivo de configuração do Maven
└── src
    └── main
        └── java
            ├── app
            │   └── Main.java        # Ponto de entrada da aplicação
            ├── model
            │   ├── Cliente.java     # Entidade Cliente
            │   ├── Pedido.java      # Entidade Pedido
            │   ├── StatusPedido.java # Enum para status de pedidos
            │   └── ...
            └── service
                └── CsvService.java  # Serviço para operações com CSV
```

---

**Observação:** Os arquivos `clientes.csv` e `pedidos.csv` são gerados durante a execução e estão intencionalmente listados no arquivo `.gitignore` para não serem versionados no repositório, mantendo o controle de versão focado apenas no código-fonte.