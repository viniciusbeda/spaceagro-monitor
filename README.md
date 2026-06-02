# 🚀 SpaceAgro Monitor

## 📋 Sobre o Projeto

O **SpaceAgro Monitor** é uma solução desenvolvida para monitoramento e gerenciamento de propriedades rurais através de sensores inteligentes.

A aplicação foi criada utilizando **Java Spring Boot**, com persistência de dados em **PostgreSQL**, seguindo práticas de **DevOps**, conteinerização com **Docker** e orquestração através de **Docker Compose**.

O sistema disponibiliza uma API REST capaz de realizar operações de cadastro, consulta, atualização e remoção de propriedades e sensores, permitindo o gerenciamento centralizado de informações agrícolas.

---

# 👨‍💻 Autor

**Vinicius Beda de Oliveira**

**RM:** 554914

**Disciplina:** DevOps Tools & Cloud Computing

**Instituição:** FIAP

---

# 🎯 Objetivo da Solução

O projeto tem como objetivo demonstrar a implementação de uma aplicação conteinerizada composta por múltiplos containers integrados em rede.

A solução simula um cenário de Agricultura Inteligente, permitindo o cadastro de propriedades agrícolas e sensores de monitoramento, armazenando os dados em banco PostgreSQL.

---

# 🏗 Arquitetura da Solução

A solução é composta por dois containers Docker:

### Container da Aplicação

* Spring Boot
* Java 21
* API REST
* Porta 8081

### Container do Banco de Dados

* PostgreSQL 16
* Porta 5432
* Persistência em Volume Nomeado

### Comunicação

Ambos os containers executam na mesma rede Docker:

```text
spaceagro-network
```

---

# 🛠 Tecnologias Utilizadas

* Java 21
* Spring Boot 3.4.13
* Spring Data JPA
* Hibernate
* PostgreSQL 16
* Maven
* Docker
* Docker Compose
* Git
* GitHub

---

# 📦 Estrutura do Projeto

```text
spaceagro-monitor
│
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── controller
│   │   │   ├── model
│   │   │   ├── repository
│   │   │   └── service
│   │   │
│   │   └── resources
│   │       └── application.properties
│
├── Dockerfile
├── docker-compose.yml
├── pom.xml
└── README.md
```

---

# 🗄 Modelo de Dados

## Entidade Propriedade

| Campo        | Tipo   |
| ------------ | ------ |
| id           | Long   |
| nome         | String |
| localizacao  | String |
| areaHectares | Double |

---

## Entidade Sensor

| Campo  | Tipo   |
| ------ | ------ |
| id     | Long   |
| tipo   | String |
| status | String |

---

## Relacionamento

```text
Propriedade (1)
      │
      │
      ▼
Sensor (N)
```

Uma propriedade pode possuir diversos sensores associados.

---

# 🔥 Funcionalidades

## CRUD de Propriedades

* Criar Propriedade
* Consultar Propriedade
* Atualizar Propriedade
* Remover Propriedade

---

## CRUD de Sensores

* Criar Sensor
* Consultar Sensor
* Atualizar Sensor
* Remover Sensor

---

# 🌐 Endpoints Disponíveis

## Propriedades

### Listar todas

```http
GET /propriedades
```

### Buscar por ID

```http
GET /propriedades/{id}
```

### Cadastrar

```http
POST /propriedades
```

### Atualizar

```http
PUT /propriedades/{id}
```

### Excluir

```http
DELETE /propriedades/{id}
```

---

## Sensores

### Listar todos

```http
GET /sensores
```

### Buscar por ID

```http
GET /sensores/{id}
```

### Cadastrar

```http
POST /sensores
```

### Atualizar

```http
PUT /sensores/{id}
```

### Excluir

```http
DELETE /sensores/{id}
```

---

# 🚀 How To - Executando o Projeto

## 1. Clonar o repositório

```bash
git clone <URL_DO_REPOSITORIO>
```

```bash
cd spaceagro-monitor
```

---

## 2. Gerar o pacote da aplicação

```bash
mvn clean package -DskipTests
```

---

## 3. Construir e iniciar os containers

```bash
docker-compose up -d --build
```

---

## 4. Verificar containers

```bash
docker ps
```

Saída esperada:

```text
spaceagro-monitor-rm554914
postgres-rm554914
```

---

## 5. Verificar logs

### Aplicação

```bash
docker logs spaceagro-monitor-rm554914
```

### Banco

```bash
docker logs postgres-rm554914
```

---

# 💾 Evidência de Persistência

## Acessar PostgreSQL

```bash
docker exec -it postgres-rm554914 psql -U postgres -d spaceagro
```

---

## Consultar Propriedades

```sql
SELECT * FROM propriedade;
```

---

## Consultar Sensores

```sql
SELECT * FROM sensor;
```

---

# 🐳 Containers

## Aplicação

| Item    | Valor                      |
| ------- | -------------------------- |
| Nome    | spaceagro-monitor-rm554914 |
| Porta   | 8081                       |
| Usuário | appuser                    |
| Workdir | /app                       |

---

## Banco de Dados

| Item    | Valor             |
| ------- | ----------------- |
| Nome    | postgres-rm554914 |
| Porta   | 5432              |
| Banco   | spaceagro         |
| Usuário | postgres          |

---

# 🔒 Requisitos DevOps Atendidos

✅ Dockerfile personalizado

✅ Docker Compose

✅ Imagem personalizada

✅ Usuário não privilegiado

✅ Diretório de trabalho definido

✅ Variáveis de ambiente

✅ Containers em background

✅ Volume nomeado

✅ Rede Docker compartilhada

✅ CRUD completo

✅ Persistência de dados

✅ Banco PostgreSQL

✅ Logs dos containers

✅ Acesso aos containers com docker exec

✅ Evidência de persistência via SELECT

---

# 📹 Demonstração

O vídeo demonstra:

* Clonagem do projeto
* Build da aplicação
* Execução dos containers
* Verificação dos logs
* Operações CRUD
* Persistência dos dados
* Acesso aos containers
* Evidências exigidas pela disciplina

---

# 📄 Licença

Projeto desenvolvido exclusivamente para fins acadêmicos na FIAP.
