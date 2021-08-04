# Parte II - JDBC e drivers de conexão

1. Download do driver específico(MySQL) via Maven
2. Criar string de conexão (URL)
3. Criar conexão `Connection` com `DriverManager`

## JDBC
* JDBC: Java Database Connectivity
* API: classes e interfaces escritas em Java
* pacotes `java.sql` e `javax.sql`
* driver JDBC: intermedia interação com banco de dados

## DriverManager
* Criar `Connection` através de uma `URL`

## Connection
* Representa conexão com banco de dados
* Permite criar `Statements` para consultas em SQL

## Código java para conexão com BD
```java
String urlConnection = "jdbc:mysql://localhost/digital_innovation_one";
String user = "user";
String password = "password";

try (Connection conn = DriverManager.getConnection(urlConnection, user, password)){            
    System.out.println("Conectado com sucesso!");
} catch (Exception e) {
    System.out.println("Conexão falhou!");
    e.printStackTrace();
}
```