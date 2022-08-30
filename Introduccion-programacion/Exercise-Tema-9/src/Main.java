public class Main {
    public static void main(String[] args) {
        Client client1 = new Client();
        client1.credit = "$3000";
        client1.age = 22;
        client1.name = "Lautaro";
        client1.phone = "3512345646";
        System.out.println(client1.name + ", "+ client1.age + " years old, "+ client1.credit + " Credit, Phone " + client1.phone);

        Employee employee1 = new Employee();
        employee1.salary = "$4523";
        employee1.age = 32;
        employee1.name = "Jose";
        employee1.phone = "4321564423";
        System.out.println(employee1.name + ", "+ employee1.age + " years old, "+ employee1.salary + " Salary, Phone " + employee1.phone);
    }
}

class Person {
    int age;
    String name;
    String phone;

}

class Client extends Person {
    String credit;
}

class Employee extends Person {
    String salary;
}