import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HRT14_JavaPriorityQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PriorityQueue<StudentQueue> studentsQueue = new PriorityQueue<>(Comparator.comparing(StudentQueue::getCgpa)
                .reversed()
                .thenComparing(StudentQueue::getName)
                .thenComparing(StudentQueue::getId));

        int num = Integer.parseInt(scanner.nextLine());

        while (num-- > 0) {
            String line = scanner.nextLine();
            String command = line.split("\\s+")[0];

            if (command.equals("ENTER")) {
                int id = Integer.parseInt(line.split("\\s+")[3]);
                String name = line.split("\\s+")[1];
                double cgpa = Double.parseDouble(line.split("\\s+")[2]);
                studentsQueue.add(new StudentQueue(id, name, cgpa));
            } else if (command.equals("SERVED")) {
                studentsQueue.poll();
            }
        }

        if (studentsQueue.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!studentsQueue.isEmpty()) {
                StudentQueue studentName = studentsQueue.poll();
                System.out.println(studentName.getName());
            }
        }
    }
}

class StudentQueue {

    private int id;
    private String name;
    private double cgpa;

    public StudentQueue(int id, String name, double cgpa) {
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
}
/*In this problem we will test your knowledge on Java Priority Queue.
There are a number of students in a school who wait to be served. Two types of events, ENTER and SERVED,
can take place which are described below.
ENTER: A student with some priority enters the queue to be served.
SERVED: The student with the highest priority is served (removed) from the queue.
A unique id is assigned to each student entering the queue. The queue serves the students based on the
following criteria (priority criteria):
- The student having the highest Cumulative Grade Point Average (CGPA) is served first.
- Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
- Any students having the same CGPA and name will be served in ascending order of the id.
Create the following two classes:
- The Student class should implement:
    - The constructor Student(int id, String name, double cgpa).
    - The method int getID() to return the id of the student.
    - The method String getName() to return the name of the student.
    - The method double getCGPA() to return the CGPA of the student.
The Priorities class should implement the method List<Student> getStudents(List<String> events) to process all the
given events and return all the students yet to be served in the priority order.
Input Format:
The first line contains an integer, n, describing the total number of events. Each of the n subsequent lines
will be of the following two forms:
ENTER name CGPA id: The student to be inserted into the priority queue.
SERVED: The highest priority student in the queue was served.
The locked stub code in the editor reads the input and tests the correctness of the Student and
Priorities classes implementation.
Output Format:
The locked stub code prints the names of the students yet to be served in the priority order. If there are no such
student, then the code prints EMPTY.
*/