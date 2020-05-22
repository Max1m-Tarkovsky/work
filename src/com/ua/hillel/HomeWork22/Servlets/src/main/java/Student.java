import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Student {

    private int id;
    private String first_name;
    private String last_name;
    private int groupp;

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getGroupp() {
        return groupp;
    }

    public int getYear_of_receipt() {
        return year_of_receipt;
    }

    private int  year_of_receipt;

    public Student(int id, String first_name, String last_name, int groupp, int year_of_receipt) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.groupp = groupp;
        this.year_of_receipt = year_of_receipt;
    }
}
