import java.util.*;
class StudentFeeDiscountparttwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Fee: ");
        double fee = sc.nextDouble();
        System.out.print("Enter University Discount Percentage: ");
        double discountPercent = sc.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;
        System.out.println("Discount Amount is INR " + discount);
        System.out.println("Fee to be paid after discount is INR " + finalFee);
        sc.close();
    }
}
