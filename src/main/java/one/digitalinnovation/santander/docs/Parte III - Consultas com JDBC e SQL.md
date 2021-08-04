# Consultas com JDBC
* Três **Interfaces**:
    + `Statement`: Executar SQL comum
    + `PreparedStatement`: Executar SQL parametrizável
    + `CallableStatement`: Executar stored procedures
* Parametrizar consulta:
    + Preferir `PreparedStatement` ao `Statement`
    + Previne SQL Injection
    + Mais legível
    + Melhor desempenho
* Três métodos
    + `execute`: executar qualquer tipo de SQL
    + `executeQuery`: executar `SELECT`
    + `executeUpdate`: executar `INSERT`, `UPDATE`, `DELETE`, `CREATE`, `ALTER`
* Retorno
    + `ResultSet`: armazena o retorno de uma consulta
    + `getInt`, `getFloat`, `getString`: captura dado de um retorno `ResultSet`
    + `next()`: percorre registros do retorno `ResultSet`, normalmente com `while`.

