package student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


            Student[] students = {
                    new Student("Alice", "Smith", 90),
                    new Student("Bob", "Johnson", 85),
                    new Student("Charlie", "Williams", 92),
                    new Student("David", "Brown", 88),
                    new Student("Eve", "Jones", 78),
                    new Student("Frank", "Garcia", 84),
                    new Student("Grace", "Miller", 91),
                    new Student("Hannah", "Davis", 95),
                    new Student("Ivan", "Martinez", 80),
                    new Student("Jack", "Rodriguez", 89)
            };

            Arrays.sort(students);

            for (Student student : students) {
                System.out.println(student);
            }
        Worker[] workers = {
                new Worker("Alice", "Smith", 50000, 160),
                new Worker("Bob", "Johnson", 55000, 160),
                new Worker("Charlie", "Williams", 47000, 160),
                new Worker("David", "Brown", 60000, 160),
                new Worker("Eve", "Jones", 53000, 160),
                new Worker("Frank", "Garcia", 52000, 160),
                new Worker("Grace", "Miller", 58000, 160),
                new Worker("Hannah", "Davis", 62000, 160),
                new Worker("Ivan", "Martinez", 51000, 160),
                new Worker("Jack", "Rodriguez", 59000, 160)
        };

        Arrays.sort(workers);

        for (Worker worker : workers) {
            System.out.println(worker);
        }
    }
        }




