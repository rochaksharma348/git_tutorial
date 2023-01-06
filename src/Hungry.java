import java.util.Scanner;

public class Hungry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Are you hungry?");
        String ans = sc.nextLine();

        if (ans.equals("yes") || ans.equals("haa")) {
            System.out.println("Eat a samosa");
        } else {
            System.out.println("Are you thirsty?");
            ans = sc.nextLine();
            if (ans.equals("yes")) {
                System.out.println("Drink water");
            } else {
                System.out.println("go, do your homework");
            }
        }
    }
}
