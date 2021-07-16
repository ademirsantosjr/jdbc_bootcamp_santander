# Parte I - Configurar Banco de Dados
1. instalar MySQL
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
Para conectar no banco de dados novamente:
```bash
mysql -u root -p
```
### Instalação do Workbench
```bash
sudp apt install mysql-workbench
```
Comando para executar:
```bash
mysql-workbench
```
### Criação do banco de dados
Para uma instância do banco de dados:
* Acessar o MySQL via terminal
* Utilizar comando:
    + `show database;`
* visualizar bancos de dados padrão

Para criar o seu banco de dados:
```sql
CREATE database digital_innovaition_one;
```
Informa ao MySQL que será este o banco de dados a ser utilizado:
```sql
USE ditigal_innovation_one;
```
Confirme / Visualize com:
```sql
SELECT database();
```
### Criar uma tabela
Enquanto logado no SGBD e conectado no bando de dados que foi criado, criar a tabela:
```sql
CREATE TABLE aluno (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome INTEGER NOT NULL,
    idade INTEGER NOT NULL,
    estado CHARACTER(2) NOT NULL
);
```
Confirme a criação com:
```sql
SHOW TABLES;
```
Selecione a tabela:
```sql
SELECT * FROM aluno; --estará vazia
```
Grave alguns registros:
```sql
INSERT INTO aluno(nom, idade, estado)
VALUES ('Pedro', 20, 'RJ');
INSERT INTO aluno(nom, idade, estado)
VALUES ('Maria', 35, 'AC');
INSERT INTO aluno(nom, idade, estado)
VALUES ('Joao', 10, 'SC');
INSERT INTO aluno(nom, idade, estado)
VALUES ('Ana', 51, 'GO');
```