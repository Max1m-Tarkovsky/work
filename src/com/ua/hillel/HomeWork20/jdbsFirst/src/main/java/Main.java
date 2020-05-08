import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/HILELL2020?"
                + "useSSL=false&user=root&password=Tarkovsky061295");
        Statement statement = connection.createStatement();


        avgPointStudent(statement);
        studentSerchOfYearsReceipt(statement);
        studentSerchResaltByGroupp(statement);
        pointNameTeacherStudents(statement);
        nameAllStudent(statement);
        connection.close();


    }






    private static void avgPointStudent(Statement statement) throws SQLException {
        ResultSet avgPoint = statement.executeQuery("SELECT st.First_name,st.Last_name, avg(bl.Point) FROM HILELL2020.Balls bl\n" +
                "left join HILELL2020.Student st\n" +
                "on st.id = bl.Student\n" +
                "where st.First_name = \"Ivan\" and st.Last_name = \"Ivanov\" ;");

        List<AvgPoint2> avgPoint2 = new ArrayList<>();
        while (avgPoint.next()) {
            int avgPoint1 = avgPoint.getInt("avg(bl.Point)");
            String firstName = avgPoint.getString("first_name");
            String lastName = avgPoint.getString("last_name");
            avgPoint2.add(new AvgPoint2(firstName,lastName,avgPoint1));

        }
        System.out.println(avgPoint2);
    }


    private static void studentSerchOfYearsReceipt(Statement statement) throws SQLException {
        ResultSet studentSearchResultByYearOfReceipt = statement.executeQuery("Select first_name,last_name From Student st\n" +
                "where st.Year_of_receipt = 2012;");
        List<StudentGroup> studentYearOFReceipt = new ArrayList<>();
        while (studentSearchResultByYearOfReceipt.next()) {
            String firstName = studentSearchResultByYearOfReceipt.getString("first_name");
            String lastName = studentSearchResultByYearOfReceipt.getString("last_name");
            studentYearOFReceipt.add(new StudentGroup(firstName, lastName));

        }
        System.out.println(studentYearOFReceipt);

    }

    private static void studentSerchResaltByGroupp(Statement statement) throws SQLException {
        ResultSet studentSearchResultByGroup = statement.executeQuery("Select first_name,last_name From Student \n" +
                "where groupp = 2;");

        List<StudentGroup> studentGroup = new ArrayList<>();
        while (studentSearchResultByGroup.next()) {
            String firstName = studentSearchResultByGroup.getString("first_name");
            String lastName = studentSearchResultByGroup.getString("last_name");
            studentGroup.add(new StudentGroup(firstName, lastName));

        }
        System.out.println(studentGroup);
    }


    private static void pointNameTeacherStudents(Statement statement) throws SQLException {
        ResultSet resultSet1 = statement.executeQuery("SELECT st.First_name,st.Last_name, oc.Name,th.Firsst_name,th.Lasst_name ,bl.Point FROM HILELL2020.Balls bl\n" +
                "Left join HILELL2020.Teacher th \n" +
                "on  th.Teacher_code = bl.Occupation\n" +
                "left join HILELL2020.Student st\n" +
                "on st.id = bl.Student\n" +
                "left join HILELL2020.Occupation oc\n" +
                "on oc.Lesson_code = bl.Occupation\n" +
                "where st.First_name = \"Ivan\" and st.Last_name = \"Ivanov\";");

        List<Student1> students1 = new ArrayList<>();
        while (resultSet1.next()) {
            String nameStudent = resultSet1.getString("First_name");
            String sonameStudent = resultSet1.getString("Last_name");
            String nameOccupation = resultSet1.getString("Name");
            int point = resultSet1.getInt("Point");
            String nameTeacher = resultSet1.getString("Firsst_name");
            String sonameTeacher = resultSet1.getString("Lasst_name");
            students1.add(new Student1(nameStudent, sonameStudent, nameOccupation, nameTeacher, sonameTeacher, point));

        }

        System.out.println(students1);
    }


    private static void nameAllStudent(Statement statement) throws SQLException {
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

    }

}



