package daniel.desafioBoardTarefas.persistence.migration;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.DatabaseException;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import lombok.AllArgsConstructor;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;

import static daniel.desafioBoardTarefas.persistence.config.ConnectionConfig.getConnection;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    public MigrationStrategy(Connection connection) {
        this.connection = connection;
    }


    public void executeMigration() {
        var orginalOut = System.out;
        var originalErr = System.err;

        try (var fos = new FileOutputStream("liquibase.log")) {
            System.setOut(new PrintStream(fos));
            System.setErr(new PrintStream(fos));
            try (
                    var connection = getConnection();
                    var jdbcConnection = new JdbcConnection(connection);) {

                var liquibase = new Liquibase(
                        "/db/changelog/db.changelog-master.yml",
                        new ClassLoaderResourceAccessor(),
                        jdbcConnection);
            } catch (SQLException | LiquibaseException e) {
                e.printStackTrace();

                System.setErr(originalErr);

            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            System.setOut(orginalOut);
            System.setErr(originalErr);
        }
    }
}


