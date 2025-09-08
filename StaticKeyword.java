

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "New School"; 
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Student.school = "ABC";

        Student st1 = new Student();
        st1.name = "Sumanth";

        System.out.println(st1.name);
        System.out.println(Student.school);
        Student.changeSchool();
        System.out.println(Student.school);
    }
}
