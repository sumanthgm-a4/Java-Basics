
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student3 {
    String name;
    int age;

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString() {
        return name + " - " + age;
    }
}

// Use Comparator<T> for custom ordering
class NameComparator implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        return s1.name.compareTo(s2.name); // ascending order by name
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student3> students = new ArrayList<>();
        students.add(new Student3("Sumanth", 25));
        students.add(new Student3("Porus", 22));
        students.add(new Student3("Pavan", 28));

        Collections.sort(students, new NameComparator()); // custom sort
        System.out.println(students);
    }
}
