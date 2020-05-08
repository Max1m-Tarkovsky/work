import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Student1 {
    private String nameStudent;
    private String sonameStudent;
    private String nameOccupation;
    private String nameTeacher;
    private String sonameTeacher;
    private int point;

    public Student1(String nameStudent, String sonameStudent, String nameOccupation, String nameTeacher, String sonameTeacher, int point) {
        this.nameStudent = nameStudent;
        this.sonameStudent = sonameStudent;
        this.nameOccupation = nameOccupation;
        this.nameTeacher = nameTeacher;
        this.sonameTeacher = sonameTeacher;
        this.point = point;
    }
}
