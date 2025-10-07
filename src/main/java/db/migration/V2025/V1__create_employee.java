package db.migration.V2025;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V1__create_employee extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {
        try (Statement statement = context.getConnection().createStatement()) {
            statement.execute("CREATE TABLE employee (employee_id INT PRIMARY KEY, name VARCHAR(100), age INT, job VARCHAR(100))");
        }
    }
}
