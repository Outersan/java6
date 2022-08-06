package ru.netology.stats.service.BusinessService;

import ru.netology.stats.services.BusinessService;

public class Main {
    public static void main(String[] args) {
        BusinessService service = new BusinessService();

        int[] profit = {
        8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
};

        service.getYearlyProfit(profit);
        service.getAverage(profit);
        service.getLowestSalesMonth(profit);
    }
}
