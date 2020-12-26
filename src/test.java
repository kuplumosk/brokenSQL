import java.sql.SQLException;

class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/first_lesson";
        String userName = "root";
        String password = "123";
        Class.forName("com.mysql.jdbc.Driver");

//        Connection conn = DriverManager.getConnection(url, userName, password);
    }
}
