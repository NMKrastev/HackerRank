import java.util.*;

public class HRT9_JavaSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = Double.parseDouble(scanner.nextLine());

            Student student = new Student(id, name, cgpa);
            studentList.add(student);

            testCases--;
        }

        Collections.sort(studentList);
        studentList.forEach(student -> System.out.println(student.getName()));
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student anotherStudent) {
        return Comparator.comparingDouble(Student::getCgpa)
                .reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getId)
                .compare(this, anotherStudent);
    }
}
/*You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to
their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name
in alphabetical order. If those two students also have the same first name, then order them according to their ID.
No two students have the same ID.
Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
Input Format:
The first line of input contains an integer N, representing the total number of students. The next N lines contains a
list of student information in the following structure:
ID Name CGPA*/