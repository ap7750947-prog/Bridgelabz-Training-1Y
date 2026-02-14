package com.gla.string.builtinfunction;
    import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
    public class DateFormatsExample {
        public static void main(String[] args) {

            // Get current date
            LocalDate today = LocalDate.now();

            // Format 1: DD-MM-YYYY
            DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Format 2: Month DD, YYYY
            DateTimeFormatter format2 = DateTimeFormatter.ofPattern("MMM dd, yyyy");

            // Format 3: Day, Month DD, YYYY
            DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

            // Display formatted dates
            System.out.println("Format 1 (dd-MM-yyyy): " + today.format(format1));
            System.out.println("Format 2 (MMM dd, yyyy): " + today.format(format2));
            System.out.println("Format 3 (EEEE, MMMM dd, yyyy): " + today.format(format3));
        }
    }


