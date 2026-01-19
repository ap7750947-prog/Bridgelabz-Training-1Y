import java.util.*;
class SimpleInterest{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("enter principle");
int principle=sc.nextInt();
System.out.println("enter rate");
int rate = sc.nextInt();
System.out.println("enter time");
int time =sc.nextInt();
System.out.println("SimpleInterest is :");
double SimpleInterest = (principle*rate*time)/100;
System.out.println(SimpleInterest);
}
}

