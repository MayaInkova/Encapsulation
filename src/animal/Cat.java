package animal;


class Cat extends Animal {
    public Cat(int age, String name, String gender) {
        super(age, name, gender);
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }
}
