import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Person 1 info");
        Owner person = new Owner();
        person.setName(sc.nextLine());
        person.setCity(sc.nextLine());
        person.setHeight(sc.nextLine());
        person.info();
    }
}