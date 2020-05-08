import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.swing.*;
@Getter
@Setter
@ToString

public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private int groupp;
    private int  year_of_receipt;

    public Student(int id, String first_name, String last_name, int groupp, int year_of_receipt) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.groupp = groupp;
        this.year_of_receipt = year_of_receipt;
    }
}
