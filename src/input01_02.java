import java.util.Scanner;

public class input01_02 {

    public static void main(String[] args) {

        System.out.println("Enter Number.... ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        System.out.println("The number is: " +num1);

        System.out.println("Enter your name: ");
        Scanner sc1 = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("The name is: " + str1);


        System.out.println("Enter your name: ");
        Scanner sc2 = new Scanner(System.in);
        String str2 = sc2.nextLine();
        System.out.println("The name is: " + str2);

    }
}
