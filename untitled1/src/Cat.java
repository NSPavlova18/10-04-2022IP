public class Cat {
    private String name;

    public Cat() {
        this.name = "Pisa";
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.printf("Dog %s said: Wow-wow!%n", name);
    }
}
