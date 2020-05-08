import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AvgPoint2 {

    private String name;
    private String soname;
    private int point;

    public AvgPoint2(String name, String soname, int point) {
        this.name = name;
        this.soname = soname;
        this.point = point;
    }
}
