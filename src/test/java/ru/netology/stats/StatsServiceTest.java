package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {

    @Test
    void shouldTotalSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.totalSales(salesData);
        assertEquals(expected,actual);
        }


    @Test
    void shouldmonthAverageSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180/12;
        long actual = service.monthAverageSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8; // номер месяца
        long actual = service.maxSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldMinSales() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9; // номер месяца
        long actual = service.minSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNumberMonthsBelowAverage() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberMonthsBelowAverage(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNumberMonthsAboveAverage() {
        StatsService service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.numberMonthsAboveAverage(salesData);
        assertEquals(expected,actual);
    }



}