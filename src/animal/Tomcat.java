package animal;

class Tomcat extends Cat {
    public Tomcat(int age, String name) {
        super(age, name, "Male");
    }

    @Override
    public String makeSound() {
        return "Meow! (tomcat)";
    }
}