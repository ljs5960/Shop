package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class JDBCTest {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testConnection() {
        try(Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/shop?serverTimezone=Asia/Seoul&characterEncoding=UTF-8", "root", "ekdhs12!@")) {
            System.out.println(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
