package ru.netology.stats.pricemvn.service;


public class StatsService {

    public long summarySales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) {
        return summarySales(sales) / 12;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth;
    }

    public long totalMonthLow(long[] sales) {
        long avg = average(sales);
        long countMin = 0;
        for (long sale : sales) {

            if (sale < avg) {
                countMin++;
            }
        }
        return countMin;
    }

    public long totalMonthHigh(long[] sales) {
        long avg = average(sales);
        long countMax = 0;
        for (long sale : sales) {
            if (sale > avg) {
                countMax++;
            }
        }
        return countMax;
    }
}

