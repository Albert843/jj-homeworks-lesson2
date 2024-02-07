package homework2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Animal[] animals = {new Dog(), new Cat()};
        for (int i = 0; i < animals.length; i++) {
            getInfo(animals[i]);
        }
    }
    /*
        Метод для вывода информации об объекте
     */
    public static void getInfo(Animal animal) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<?> clazz = animal.getClass();                             // получаем тип объекта
        String className = clazz.getName();                             // получаем имя типа объекта
        Class<?> typeOfAnimal = Class.forName(className);               // создаем Class для рефлексии

        Constructor[] constructors = typeOfAnimal.getConstructors();    // Конструкторы
        for (Constructor constructor : constructors) {
            System.out.println("---------------------------");
            System.out.println("Constructor: " + constructor);
        }

        Object animalInstance = constructors[0].newInstance();          // Создаем объект

        Field[] fields = clazz.getDeclaredFields();                     // Поля
        for (Field field : fields) {
            System.out.println("Field: " + field);
        }

        Method[] methods = clazz.getDeclaredMethods();                  // Методы
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        Method makeSoundMethod = clazz.getMethod("makeSound");    // вызов метода у объекта
        makeSoundMethod.invoke(animalInstance);
    }
}
