package ru.netology.services;

public class VacationService {
    public int calcVacationMonths(int income, int expenses, int threshold) {

        int balance = 0;
        int vacationMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (balance >= threshold){
                balance = balance - expenses;
                balance = balance / 3;
                vacationMonths++;
            } else {
                balance = balance + income;
                balance = balance - expenses;
            }

        }

        return vacationMonths;
    }
}
