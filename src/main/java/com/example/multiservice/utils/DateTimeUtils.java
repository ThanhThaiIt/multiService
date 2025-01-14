package com.example.multiservice.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.mapstruct.Named;
import org.springframework.stereotype.Component;

@Component
public class DateTimeUtils {

    @Named("parseStringToLocalDateTime")
    public LocalDateTime parseStringToLocalDateTime(String dateString) {
        return LocalDateTime.parse(dateString);
    }

    @Named("parserStringToLocalDate")
    public LocalDate parseStringToLocalDate(String dateString) {return LocalDate.parse(dateString);}
}
