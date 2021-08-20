package Lists;

import java.util.ArrayList;
import java.util.List;


public class EX_9_Student {
    static List<EX_9_Student> studentList = new ArrayList<>();
    String name;
    int group;
    int course;
    int russianMark;
    int englishMark;
    int mathMark;
    int biologyMark;

    public EX_9_Student(String name, int group, int course, int russianMark, int englishMark, int mathMark, int biologyMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.russianMark = russianMark;
        this.englishMark = englishMark;
        this.mathMark = mathMark;
        this.biologyMark = biologyMark;
    }

    public static void addStudentList() {
        studentList.add(new EX_9_Student("Bob", 112, 2, 5, 4, 1, 4));
        studentList.add(new EX_9_Student("Rachel", 112, 4, 4, 4, 5, 3));
        studentList.add(new EX_9_Student("Mark", 112, 1, 3, 2, 2, 3));
        studentList.add(new EX_9_Student("Steven", 112, 3, 2, 3, 3, 3));
        studentList.add(new EX_9_Student("Lesly", 112, 2, 4, 5, 5, 4));
        studentList.add(new EX_9_Student("Jane", 112, 1, 5, 5, 5, 5));
    }

    public static List<EX_9_Student> checkToNextCourse(List<EX_9_Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            EX_9_Student person = studentList.get(i);
            if ((person.russianMark + person.englishMark + person.mathMark + person.biologyMark) / 4 >= 3) {
                System.out.println("Welcome " + person.name + "! ");
                System.out.println("Now you can change course!");
            } else {
                System.out.println(person.name + " removed from our group");
                studentList.set(i, null);
            }

            System.out.println();
        }
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = 0; j < studentList.size(); j++) {
                EX_9_Student person = studentList.get(i);
                if (person == null) {
                    studentList.remove(i);
                }
            }
        }
        return studentList;
    }

    public static void printStudents() {
        for (EX_9_Student kidsPrint : studentList) {
            System.out.println(kidsPrint.name + "  " + kidsPrint.course);
        }
    }

    public static void main(String[] args) {
        addStudentList();
        checkToNextCourse(studentList);
        printStudents();
    }
}