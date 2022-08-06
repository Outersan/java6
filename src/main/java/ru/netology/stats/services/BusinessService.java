package ru.netology.stats.services;
public class BusinessService {

    public int getYearlyProfit (int[] profit) {
        int sum = 0;
        for (int i : profit) {
            sum += i;
            System.out.println(sum);
        }
        return sum;
    }

    public double getAverage (int[] profit) {
        double sumAv = getYearlyProfit(profit);

        return sumAv / profit.length;
    }

    public int getPeakSalesMonth (int[] profit) {
        int peakMonth = 0;
        int month = 0;
        for (long sale : profit) {
            if (sale >= profit[peakMonth]) {
                peakMonth = month;
            }
            month = month +1;
        }
        return peakMonth + 1;
    }

    public int getLowestSalesMonth (int[] profit) {
        int lowMonth = 0;
        int month = 0;
        for (long sale : profit) {
            if (sale <= profit[lowMonth]) {
                lowMonth = month;
            }
            month = lowMonth + 1;
        }
        return lowMonth + 1;
    }

    public int getAmountOfMonthsWithSalesLowerThanAv (int[] profit) {
        double averageSales = getAverage(profit);

        int minMonth = 0;
        int month = 0;
        for (int i = 0; i < profit.length; i++) {
            if (profit[i] < averageSales) {
                month = minMonth + 1;
            }
        }
        return month;
    }

    public int getAmountOfMonthsWithSalesHigherThanAv (int[] profit) {
        double averageSales = getAverage(profit);

        int maxMonth = 0;
        int month = 0;
        for (int i = 0; i < profit.length; i++) {
            if (profit[i] > averageSales) {
                month = maxMonth + 1;
            }
        }
        return month;
    }
}
