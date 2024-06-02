package animal;

class Dog extends Animal {
    public Dog(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }
}