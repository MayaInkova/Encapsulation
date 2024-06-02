package animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(5, "Buddy", "Male"),
                new Frog(2, "Frodo", "Male"),
                new Cat(3, "Whiskers", "Female"),
                new Kitten(1, "Kitty"),
                new Tomcat(4, "Tom"),
                new Dog(3, "Bella", "Female"),
                new Frog(1, "Lily", "Female"),
                new Cat(2, "Simba", "Male"),
                new Kitten(2, "Mittens"),
                new Tomcat(5, "Jerry")
        };

        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}

