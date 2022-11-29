import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Multiplication multiplication = new Multiplication();
        System.out.println(multiplication);
        Task task1 = new Task(10, 3);
        Task task2 = new Task(3, 10);
        Task task3 = new Task(7, 7);
        Set<Task> tasks = new HashSet<>();
        tasks.add(task2);
        tasks.add(task1);
        tasks.add(task3);
        System.out.println(tasks);


        Passport passport1 = new Passport("A", "B", "C", 112200, 1);
        Set<Passport> passports = new HashSet<>();
        passports.add(passport1);
        System.out.println(passport1.getPassportNum());



    }

}