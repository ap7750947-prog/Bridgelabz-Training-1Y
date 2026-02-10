import java.util.*;

class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Maths marks:");
        int mathsMarks = sc.nextInt();

        System.out.println("Enter Physics marks:");
        int physicsMarks = sc.nextInt();

        System.out.println("Enter Chemistry marks:");
        int chemistryMarks = sc.nextInt();

        double averageOfPCM = (mathsMarks + physicsMarks + chemistryMarks) / 3.0;

        System.out.println("Average of PCM is: " + averageOfPCM);
    }
}
