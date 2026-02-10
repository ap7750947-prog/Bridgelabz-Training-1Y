import java.util.*;
class celsiustofahrenheit{
public static void main(String[]args){
Scanner sc = newScanner(System.in);
double celsius = sc.nextDouble();
double fahrenheit = (celsius * 9/5)+32;
System.out.println("%.2f Celsius is equal to %.2f Fahrenheit",celsius,fahrenheit);
sc.close();
}
}
