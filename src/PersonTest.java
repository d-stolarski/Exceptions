import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person person = new Person();

        System.out.println("Podaj imię:");
        person.setFirstName(scan.nextLine());
        System.out.println("Podaj nazwisko:");
        person.setLastName(scan.nextLine());
        System.out.println("Podaj wiek:");
        person.setAge(scan.nextInt());
        scan.nextLine();
        System.out.println("Podaj pesel:");
        person.setPesel(scan.nextLine());

        System.out.println(person);

    }
}
