
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        
        List<StudentStream> students = new ArrayList<>(
            List.of(
                new StudentStream(1, "Sum"),
                new StudentStream(3, "Porus"),
                new StudentStream(3, "Pavan"),
                new StudentStream(4, "Sarfaraaz")
            )
        );

        students.stream()
            .sorted(
                Comparator.comparing((StudentStream student) -> student.getId())
                            .thenComparing(student -> student.getName())
                )
            .forEach(student -> System.out.println(student));
    }
}


class StudentStream {
    private int id;
    private String name;
    
    public StudentStream(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentStream [id=" + id + ", name=" + name + "]";
    }
    
}
