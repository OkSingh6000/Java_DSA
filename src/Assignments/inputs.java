package Assignments;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Rollno: ");
        int roll = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter Field of Interest: ");
        String field = sc2.next();

        System.out.println("Name: " +name);
        System.out.println("rollno: " +roll);
        System.out.println("Field: " +field);


        //////////////////////////////////////////////////////////////////////////////////////////


        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String str1 = sc3.nextLine();

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter Second String: ");
        String str2 = sc4.nextLine();

        System.out.print(str1+str2);

///////////////////////////////////////////////////////////////////////////////////////////////////////



        Scanner sc5 = new Scanner(System.in);
        int s1 = sc5.nextInt();


        Scanner sc6 = new Scanner(System.in);
        int s2 = sc6.nextInt();

        Scanner sc7 = new Scanner(System.in);
        int s3 = sc7.nextInt();

        int Total = (s1+s2+s3);
        int percent = (Total/3);

        System.out.println(Total);
        System.out.println(percent +"%");



////////////////////////////////////////////////////////////////////////////



        Scanner sc8 = new Scanner(System.in);
        int t = sc8.nextInt();
        for (int i=1; i<=t; i++) {

            int a = sc8.nextInt();
            int b = sc8.nextInt();

            System.out.println(a+b);
        }
























    }
}
