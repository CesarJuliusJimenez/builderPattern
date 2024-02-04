package builderPattern;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Registration Form");
        System.out.println("Fill up the following:");

        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        while (firstName.trim().isEmpty()) {
            System.out.println("Please input your first name!");
            System.out.print("First Name: ");
            firstName = sc.nextLine();
        }

        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        while (lastName.trim().isEmpty()) {
            System.out.println("Please input your last name!");
            System.out.print("Last Name: ");
            lastName = sc.nextLine();
        }

        System.out.print("Email (Optional): ");
        String email = sc.nextLine();

        System.out.print("Address (Optional): ");
        String address = sc.nextLine();

        System.out.print("Contact Number: ");
        String phone = sc.nextLine();
        while (phone.trim().isEmpty()) {
            System.out.println("Please input your contact number!");
            System.out.print("Contact Number: ");
            phone = sc.nextLine();
        }

        int age;
        while (true) {
            try {
                System.out.print("Age: ");
                age = sc.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Please input your age!");
                sc.nextLine();
            }
        }

        User user = new User.UserBuilder()
                .phone(phone)
                .lastName(lastName)
                .age(age)
                .firstName(firstName)
                .email(email)
                .address(address)
                .build();

        System.out.println();
        System.out.println("User Information");
        System.out.println("First Name: " + user.firstName);
        System.out.println("Last Name: " + user.lastName);
        System.out.println("Email: " + user.email);
        System.out.println("Address: " + user.address);
        System.out.println("Contact Number: " + user.phone);
        System.out.println("Age: " + user.age);

    }
}