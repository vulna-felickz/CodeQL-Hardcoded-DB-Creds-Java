To View Security Analysis: [Fork](../../fork) + Enable Actions!


Test out CodeQL's Hardcoded Credential Capabilities on the following scenarios
-  [MSSQL](https://learn.microsoft.com/en-us/sql/connect/jdbc/working-with-a-connection?view=sql-server-ver16)
-  [PGSQL](https://jdbc.postgresql.org/documentation/use/)
-  [Oracle](https://www.javatpoint.com/example-to-connect-to-the-oracle-database)
-  MYSQL

CodeQL links!
- Query - [java/hardcoded-credential-api-call](https://github.com/github/codeql/blob/main/java/ql/src/Security/CWE/CWE-798/HardcodedCredentialsApiCall.ql)
- [Sensitive API Libarary](https://github.com/github/codeql/blob/main/java/ql/lib/semmle/code/java/security/SensitiveApi.qll#L142)

Alternatively - set up [Secret Scanning Custom Patterns to look for credentials on GitHub Enterprise](https://docs.github.com/en/enterprise-cloud@latest/code-security/secret-scanning/defining-custom-patterns-for-secret-scanning)
- [Hardcoded JDBC / Spring PW’s](https://github.com/advanced-security/secret-scanning-custom-patterns/tree/main/configs#hardcoded-spring-sql-passwords)
- [Hardcoded MySQL / Postgres PW’s](https://github.com/advanced-security/secret-scanning-custom-patterns/tree/main/configs#hardcoded-database-passwords)
