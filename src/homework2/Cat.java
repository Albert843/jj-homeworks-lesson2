package homework2;

public class Cat extends Animal{
    private String name;
    private int age;

    public Cat() {
        this.name = "Murka";
        this.age = 5;
    }
    public void makeSound() {
        System.out.println("meow");
    }
    public void getInfo() {
        System.out.printf("name: %s, age: %d\n", name, age);
    }
}
