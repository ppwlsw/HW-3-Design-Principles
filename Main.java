// 6510450658 Pinpawat Limsuwat
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("-- Register --");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your username : ");
        String username = input.nextLine();
        System.out.print("Enter your email: ");
        String email_in = input.nextLine();
        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        Email email = new Email(email_in);
        User user = new User(username,email,age);
        Service service = new Service(user);

        service.Verify();


    }
}
