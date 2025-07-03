package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    public void shouldCalcThreeVacationMonths(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();
        int result = service.calcVacationMonths(income, expenses, threshold);

        Assertions.assertEquals(income, expenses, threshold);





    }
}
