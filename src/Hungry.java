import java.util.Scanner;

public class Hungry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you hungry?");
        String ans = sc.nextLine();

        if (ans.equals("yes")) {
            System.out.println("Eat a samosa");
        } else {
            System.out.println("go, do your homework");
        }


        System.out.println("Thank you for using our app.");

    }
}
