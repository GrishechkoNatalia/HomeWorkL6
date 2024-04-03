public class Employee {
    // ФИО
    private String name;
    // Должность
    private String job;
    // Почта
    private String email;
    // Телефон
    private String phone;
    // Зарплата
    private int salary;
    // Возраст
    private int age;

    public Employee(String name, String job, String email, String phone, int salary, int age) {
        this.name = name;
        this.job = job;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printName() {
        System.out.println(name);
        System.out.println(job);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
    }
}
