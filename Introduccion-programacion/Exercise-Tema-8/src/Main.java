public class Main
{
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(21);
        person1.setName("Lautaro");
        person1.setPhone("3513338855");

        System.out.println(person1.getAge());
        System.out.println(person1.getName());
        System.out.println(person1.getPhone());
    }


}
class Person{
    private int  age;
    private String name;
    private String phone;

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }


    public void setPhone(String phone){
        this.phone = phone;
    }
    public String getPhone(){
        return this.phone;
    }
}
