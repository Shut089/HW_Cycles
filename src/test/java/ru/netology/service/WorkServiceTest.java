package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.service.HW_Cycles.WorkService;

public class WorkServiceTest {

    @ParameterizedTest
//    @CsvSource({
//            "10000,3000,20000",
//            "100000,60000,150000"
//    })
    @CsvFileSource (files="src/test/resources/testData.csv")
    public void calcWorkTest(int income, int expenses, int threshold, int expected){
        WorkService service = new WorkService();

//        int income = 10_000;
//        int expenses = 3_000;
//        int threshold = 20_000;
//        int expected = 4;
        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }
//    @Test
//    public void calcWorkTestTwo(){
//        WorkService service = new WorkService();
//
//        int income = 100_000;
//        int expenses = 60_000;
//        int threshold = 150_000;
//        int expected = 3;
//        int actual = service.calculate(income, expenses, threshold);
//
//
//        Assertions.assertEquals(expected, actual);
//    }
}
