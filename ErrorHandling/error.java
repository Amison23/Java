package ErrorHandling;

import java.util.Scanner;

public class error {
    // making custom
    // error handlers, using throw keyword
    public int age, Age;


    // public void checkAge(int age) {
    //     if (age <= 18) {
    //         throw new ArithmeticException("Access Denied!");
    //     } else {
    //         System.out.println("Welcome!");
    //     }
    // }

    public void checkAge(int age) {
        if (age <= 18) {
            try (Scanner Age = new Scanner(System.in)) {
                age = Age.nextInt();
            }
            System.out.println("Age is " + age);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        // checkAge(age);
    }

    // static void getRole(String role) {
    //     if (role == "cooporate") {
    //         Scanner Role = new Scanner(System.in);
    //         role = role.nextInt();
    //         System.out.println("You are a " + role);
    //     } else {
    //         System.out.println("system failiure, try again later");
    //     }
    // }

    // public static void main(String[] args) {
    //     System.out.println("Enter role");
    //     getRole();
    // }
}
