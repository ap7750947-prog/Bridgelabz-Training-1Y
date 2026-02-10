import java.util.*;

class AgeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter birth year:");
        int birthYear = sc.nextInt();

        int age = 2024 - birthYear;

        System.out.println("Harry's age in 2024 is: " + age);
    }
}

