import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Ivanov Ivan Ivanovich", "Director","Dir@gmail.com","89815655655",15000,20);
        worker1.printName();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan Ivanovich","Director","Ivan@gmail.com","89815486254",100000,30);
        employees[1] = new Employee("Olegov Oleg Olegovich","Guard","Oleg@gmail.com","89815648256",20000,40);
        employees[2] = new Employee("Nikolaev Nikolai Nikolaevich","Manager","Nikolai@gmail.com","89815747879",25000,50);
        employees[3] = new Employee("Pavelov Pavel Pavelovich","Mechanic","Pavel@gmail.com","89816583214",50000,60);
        employees[4] = new Employee("Viktorov Viktor Viktorovich","Watchman","Victor@gmail.com","89814747484",15000,70);
        System.out.println(Arrays.toString(employees));
    }
}


