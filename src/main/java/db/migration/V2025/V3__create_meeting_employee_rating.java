package db.migration.V2025;

import org.flywaydb.core.api.migration.BaseJavaMigration;
import org.flywaydb.core.api.migration.Context;

import java.sql.Statement;

public class V3__create_meeting_employee_rating extends BaseJavaMigration {
    @Override
    public void migrate(Context context) throws Exception {

        try (Statement statement = context.getConnection().createStatement()) {
            statement.execute("CREATE TABLE meeting_employee_rating (" +
                    "meeting_employee_rating_id INT PRIMARY KEY, " +
                    "meeting_id INT, " +
                    "employee_id INT, " +
                    "environment VARCHAR(100), " +
                    "target_reached VARCHAR(100), " +
                    "preparation VARCHAR(100), " +
                    "content VARCHAR(100), " +
                    "rating_time TIME, " +
                    "FOREIGN KEY (meeting_id) REFERENCES Meeting(meeting_id), " +
                    "FOREIGN KEY (employee_id) REFERENCES Employee(employee_id)" +
                    ")") ;
        }
    }
}
