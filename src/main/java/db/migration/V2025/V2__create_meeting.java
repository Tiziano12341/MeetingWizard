package db.migration.V2025;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V2__create_meeting extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {
        try (Statement statement = context.getConnection().createStatement()) {
            statement.execute("CREATE TABLE meeting (meeting_id INT PRIMARY KEY,visitor VARCHAR(100), title VARCHAR(100), time TIME, location VARCHAR(100))");
        }
    }
}
