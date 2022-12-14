# Flink UDF in Go

## Requirements
- Java 8+, 64-bit
- https://github.com/superbear/java-call-go

## How to build
### Install dependencies
USERNAME={{your github username}} ACCESS_TOKEN={{github personal access token}} mvn -s .m2/settings.xml clean install

[Working with the GitHub Apache Maven registry](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-with-a-personal-access-token)

### Build
```bash
mvn clean package
```
This creates a `flink-udf-in-go-1.0-SNAPSHOT.jar` in the `target/` directory.

### Test
```bash
mvn clean test
```

## Usage
Running the container
```bash
docker compose up -d
```

Executing queries
```bash
docker compose run sql-client
```
```sql
Flink SQL> CREATE FUNCTION atoi AS 'github.superbear.flink.udf.scalar.Atoi' LANGUAGE JAVA;
Flink SQL> CREATE FUNCTION toupper AS 'github.superbear.flink.udf.scalar.ToUpper' LANGUAGE JAVA;

Flink SQL> SELECT atoi('123');
Flink SQL> SELECT toupper('hello world');

Flink SQL> exit;
```

## References
- [Flink User-defined Functions](https://nightlies.apache.org/flink/flink-docs-master/docs/dev/table/functions/udfs/)
- [Flink Docker Setup](https://nightlies.apache.org/flink/flink-docs-master/docs/deployment/resource-providers/standalone/docker/)
