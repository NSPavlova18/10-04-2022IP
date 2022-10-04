public class Owner {
    private String name;
    private String height;
    private String City;

    public Owner() {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public void info(){
        System.out.printf("I am %s born in %s, my height is %s",name,City,height);
    }
}
