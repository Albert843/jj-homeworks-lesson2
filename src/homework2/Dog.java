package homework2;

public class Dog extends Animal{
    private String name;
    private int age;

    public Dog() {
        this.name = "Barbos";
        this.age = 10;
    }
    public void makeSound() {
        System.out.println("gav-gav");
    }
    public void getInfo() {
        System.out.printf("name: %s, age: %d\n", name, age);
    }
}
