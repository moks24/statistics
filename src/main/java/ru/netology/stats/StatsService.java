package ru.netology.stats;

public class StatsService {
    public int calculateSalesAmount(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int CalculateWithADifficultAmountOfSales(int[] managerSales) {
        int sum = 0;
        for (int sale : managerSales) {
            sum += sale;
        }
        int difficult = sum / 12;
        return difficult;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int belowAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int difficult = sum / 12;
        int month = 0;
        for (int sale : sales) {
            if (sale < difficult) {
                month = month + 1;
            }
        }
        return month;
    }
    public int aboveAverageSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        int difficult = sum / 12;
        int month = 0;
        for (int sale : sales) {
            if (sale > difficult) {
                month = month + 1;
            }
        }
        return month;
    }
}