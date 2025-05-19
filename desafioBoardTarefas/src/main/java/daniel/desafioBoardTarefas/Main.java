package daniel.desafioBoardTarefas;

import daniel.desafioBoardTarefas.persistence.migration.MigrationStrategy;
import daniel.desafioBoardTarefas.ui.MainMenu;

import java.sql.SQLException;

import static daniel.desafioBoardTarefas.persistence.config.ConnectionConfig.getConnection;


public class Main {

    public static void main(String[] args) throws SQLException {
        try(var connection = getConnection()){
            new MigrationStrategy(connection).executeMigration();
        }
        new MainMenu().execute();
    }

}