public class Person {

    String name;

    int age;

    float height;

    Person (String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("George", 170);
        person1.name = "Fred";
        person1.age = 36;
        person1.height = 1.7f;
    }
}
