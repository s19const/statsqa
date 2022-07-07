package ru.netology.stats.pricemvn.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    public void allSummarySales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.summarySales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void averageSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        long actual = service.average(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.maxSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.minSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    public void totalMonthLow() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedLow = 5;
        long actualLow = service.totalMonthLow(sales);

        assertEquals(expectedLow, actualLow);
    }

    @Test
    public void totalMonthHigh() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedHigh = 5;
        long actualHigh = service.totalMonthHigh(sales);

        assertEquals(expectedHigh, actualHigh);
    }
}

