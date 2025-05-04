package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                String url = "jdbc:mysql://localhost:3306/perpustakaan";
                String user = "root";
                String password = "";
                conn = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                throw new SQLException("Gagal koneksi ke database", e);
            }
        }
        return conn;
    }
}
