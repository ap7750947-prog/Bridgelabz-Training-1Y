package com.gla.string.builtinfunction;

import java.time.LocalDate;
import java.util.Scanner;

public class DataCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date in format YYYY-MM-DD:");
        String inputDate = sc.nextLine();

        // Convert String to LocalDate
        LocalDate date = LocalDate.parse(inputDate);

        // Add 7 days, 1 month, 2 years
        LocalDate updatedDate = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        System.out.println("Final Date: " + updatedDate);

        sc.close();
    }
}

