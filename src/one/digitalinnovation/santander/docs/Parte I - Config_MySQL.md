# Parte I - Configurar Banco de Dados
1. Instalar MySQL
2. Configurar usuário e senha
3. Instalar MySQL Workbench(Opcional)
4. Criar Banco de dados
5. Criar uma tabela

## Instalação do MySQL
```bash
sudo apt update
```
```bash
sudo apt install mysql-server
```
```bash
mysql --version
```
Opcional:

```bash
sudo mysql secure installation
```
### Configurar usuáro e senha
```bash
sudo mysql
```
```bash
mysql> ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'password';
```
```bash
mysql> FLUSH PRIVILEGES;
```
```bash
mysql> quit
```
Para se conectar ao banco de dados novamente:
```bash
mysql -u root -p
```
## Instalação do Workbench
```bash
sudo apt install mysql-workbench
```
Comando para executar o Workbench:
```bash
mysql-workbench
```
## Criação do banco de dados
Para uma instância do banco de dados:
* Acessar o MySQL via terminal
* visualizar bancos de dados com o comando
    + `mysql> SHOW DATABASES;`

Para criar o banco de dados:
```sql
CREATE database digital_innovaition_one;
```
Apontar o banco de dados que será utilizado:
```sql
USE ditigal_innovation_one;
```
Confirmar / Visualizar apontamento com:
```sql
SELECT database();
```
### Criar uma tabela
Enquanto logado no SGBD, e conectado ao banco de dados previamente criado, criar a seguinte tabela:
```sql
CREATE TABLE aluno (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome INTEGER NOT NULL,
    idade INTEGER NOT NULL,
    estado CHARACTER(2) NOT NULL
);
```
Confirmar a criação da tabela com:
```sql
SHOW TABLES;
```
Mostrar todos os dados da tabela:
```sql
SELECT * FROM aluno; --tabela estará vazia
```
Gravar alguns registros:
```sql
INSERT INTO aluno(nome, idade, estado)
VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nome, idade, estado)
VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nome, idade, estado)
VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nome, idade, estado)
VALUES ('Ana', 51, 'GO');
```
