package animal;

class Kitten extends Cat {
    public Kitten(int age, String name) {
        super(age, name, "Female");
    }

    @Override
    public String makeSound() {
        return "Meow! (kitten)";
    }
}