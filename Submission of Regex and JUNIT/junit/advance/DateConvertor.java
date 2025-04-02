package org.rituraj.junit.advance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateConvertor {
    public String dateFormatter(LocalDate localDate){
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return localDate.format(outputFormatter);
    }

    public String dateFormatter(String date) {
        try {

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate localDate = LocalDate.parse(date, inputFormatter);
            return localDate.format(outputFormatter);
        }catch(DateTimeParseException e){
            throw new IllegalArgumentException("Invalid date format");
        }

    }
}
