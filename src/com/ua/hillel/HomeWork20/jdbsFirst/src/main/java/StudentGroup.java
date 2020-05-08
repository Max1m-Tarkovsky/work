import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter


public class StudentGroup {
    private String first_name;
    private String last_name;

    public StudentGroup(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }


}
