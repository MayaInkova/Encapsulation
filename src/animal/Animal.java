package animal;

abstract class Animal {
    protected int age;
    protected String name;
    protected String gender;

    public Animal(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "Animal{name='" + name + "', age=" + age + ", gender='" + gender + "', sound='" + makeSound() + "'}";
    }
}
