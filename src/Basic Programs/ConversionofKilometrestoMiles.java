import java.util.*;
class ConversionofKilometrestoMiles{
public static void main(String[]args){
System.out.println("Enter distance in kilometres");
Scanner sc = new Scanner(System.in);
double kilometres = sc.nextDouble();
double miles = sc.nextDouble();
kilometres = 1.6 * miles;
System.out.println(kilometres);
}
}
