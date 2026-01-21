import java.util.*;
class PensDistribution {
    public static void main(String[] args) {
        int numberOfPens = 14;
        int pensPerStudent = numberOfPens / 3;
        int remainingPens = numberOfPens % 3;
        System.out.println("The pen per student is " + pensPerStudent +
                           " and the remaining pens not distributed are " + remainingPens);
    }
}
