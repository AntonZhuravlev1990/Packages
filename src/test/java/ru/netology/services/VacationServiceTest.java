package ru.netology.services;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FreelancerServiceTest {

    @ParameterizedTest
    public void shouldCalcThreeVacationMonths(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int result = service.calcVacationMonths(income, expenses, threshold);

        assertEquals(expected, result);
    }
}