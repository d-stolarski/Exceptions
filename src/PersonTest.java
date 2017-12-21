import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Person person = new Person();

        try {
            System.out.println("Podaj imię:");
            person.setFirstName(scan.nextLine());
        } catch (NameUndefinedException e) {
            System.err.println(e);
            System.out.println("Podano zbyt krótkie imię/nazwisko lub wpisano null");
        }
        try {
            System.out.println("Podaj nazwisko:");
            person.setLastName(scan.nextLine());
        } catch (NameUndefinedException e) {
            System.err.println(e);
            System.out.println("Podano zbyt krótkie imię/nazwisko lub wpisano null");
        }
        try {
            System.out.println("Podaj wiek:");
            person.setAge(scan.nextInt());
        } catch (IncorrectAgeException e) {
            System.err.println(e);
            System.out.println("Podano wiek poniżej 1!");
        } finally {
            scan.nextLine();
        }
        System.out.println("Podaj pesel:");
        person.setPesel(scan.nextLine());

        System.out.println(person);

    }
}
