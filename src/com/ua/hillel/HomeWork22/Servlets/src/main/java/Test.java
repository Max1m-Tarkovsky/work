import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HILELL2020?"
                + "useSSL=false&user=root&password=Tarkovsky061295");
        Statement statement = connection.createStatement();
        Student student = new Student(1, "Nikola", "Brows", 2, 2008);

        // insert(student);
        //delete(1);
         nameAllStudent();
        connection.close();

    }


    public static int delete(int id) {

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HILELL2020?"
                    + "useSSL=false&user=root&password=Tarkovsky061295")) {

                String sql = "DELETE FROM Student WHERE id = ?";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, id);
                    System.out.println("Student id " + id + " Delete");
                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return 0;
    }

    public static int insert(Student student) {

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/HILELL2020?"
                    + "useSSL=false&user=root&password=Tarkovsky061295")) {

                String sql = "INSERT INTO Student (id,first_name,last_name,groupp,year_of_receipt) Values (?, ?, ?, ?, ?)";

                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setInt(1, student.getId());
                    preparedStatement.setString(2, student.getFirst_name());
                    preparedStatement.setString(3, student.getLast_name());
                    preparedStatement.setInt(4, student.getGroupp());
                    preparedStatement.setInt(5, student.getYear_of_receipt());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
        return 0;

    }



    public static void nameAllStudent() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HILELL2020?"
                + "useSSL=false&user=root&password=Tarkovsky061295");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from student ");
        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            int groupp = resultSet.getInt("groupp");
            int yearOfReceipt = resultSet.getInt("year_of_receipt");
            students.add(new Student(id, firstName, lastName, groupp, yearOfReceipt));

        }
        System.out.println(students);
        connection.close();
    }
}



