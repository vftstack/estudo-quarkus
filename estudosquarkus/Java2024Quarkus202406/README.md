
# Repositório da Capacitação Interna sobre Quarkus ![Quarkus](https://img.shields.io/badge/Quarkus-2E8B57?logo=quarkus&logoColor=white)

## Introdução

Este repositório contém as aplicações desenvolvidas durante a capacitação interna da Minsait sobre Quarkus. O objetivo desta capacitação foi introduzir aos colaboradores as funcionalidades e benefícios do Quarkus, utilizando um conjunto de tecnologias modernas.

## Tecnologias Utilizadas

- ![Java](https://img.shields.io/badge/Java-21-007396?logo=java&logoColor=white) **Java** - versão 21
- ![Quarkus](https://img.shields.io/badge/Quarkus-2E8B57?logo=quarkus&logoColor=white) **Quarkus**
- ![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white) **Docker**
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white) **PostgreSQL**
- ![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?logo=rabbitmq&logoColor=white) **RabbitMQ**

## Aplicações

### 1. hello-quarkus

📄 Aplicação inicial criada via linha de comando com conceitos básicos do Quarkus. Esta aplicação serve como ponto de partida para entender a estrutura e a configuração mínima necessária para criar um projeto Quarkus.

### 2. code-with-quarkus

🔧 Aplicação de exemplo gerada utilizando o portal [code.quarkus.io](https://code.quarkus.io) com a seleção de dependências específicas. Esta aplicação demonstra como configurar e utilizar diversas extensões do Quarkus para adicionar funcionalidades ao projeto.

### 3. app-food

🍔 Aplicação para backend de um serviço de pedidos de lojas de alimentação. Esta aplicação permite:
- Solicitação de cardápio
- Realização de pedidos

#### Tecnologias Utilizadas:
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white) **Banco de Dados**: Configurado em PostgreSQL
- ![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?logo=rabbitmq&logoColor=white) **Mensageria**: RabbitMQ para recepção de filas de confirmação de pedidos enviados para lojas
- ![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white) **Docker**: Utilizado para a configuração do banco de dados e da mensageria

### 4. app-loja-1

🏪 Simulação de serviço para recepção de pedidos enviados pela aplicação `app-food`. Esta aplicação finge o comportamento de uma loja que processa os pedidos recebidos.

## Estrutura do Repositório

```
/hello-quarkus
/code-with-quarkus
/app-food
/app-loja-1
```

Cada diretório contém o código-fonte e a documentação específica da aplicação, incluindo instruções de configuração e execução.

## Como Executar

### Pré-requisitos

- ![Docker](https://img.shields.io/badge/Docker-2496ED?logo=docker&logoColor=white) Docker instalado e configurado
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-336791?logo=postgresql&logoColor=white) PostgreSQL e ![RabbitMQ](https://img.shields.io/badge/RabbitMQ-FF6600?logo=rabbitmq&logoColor=white) RabbitMQ configurados via Docker

### Passos

1. Clone o repositório:
    ```bash
    git clone https://github.com/minsait/quarkus-capacitacao.git
    cd quarkus-capacitacao
    ```

2. Siga as instruções em cada diretório de aplicação para configurar e iniciar os serviços.

3. Execute as aplicações individualmente conforme descrito na documentação de cada projeto.

## Contribuição

🤝 Contribuições são bem-vindas! Entre em contato pelo e-mail: eduardohmferreira@gmail.com

---

Agradeço pela participação na capacitação e esperamos que estas aplicações sejam úteis no desenvolvimento de suas habilidades com Quarkus e tecnologias associadas.
# estudo-quarkus
