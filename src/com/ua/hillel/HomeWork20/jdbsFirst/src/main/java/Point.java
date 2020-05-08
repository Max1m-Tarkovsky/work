import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Point {
    private int point;

    public Point(int point) {
        this.point = point;
    }
}
