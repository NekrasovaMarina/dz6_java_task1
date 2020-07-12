package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatsServiceTest {

    @Test
    void shouldTotalSales() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = Service.totalSales(salesData);
        assertEquals(expected,actual);
        }


    @Test
    void shouldmonthAverageSales() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180/12;
        long actual = Service.monthAverageSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldMaxSales() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8; // номер месяца
        long actual = Service.maxSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldMinSales() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9; // номер месяца
        long actual = Service.minSales(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNumberMonthsBelowAverage() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = Service.numberMonthsBelowAverage(salesData);
        assertEquals(expected,actual);
    }

    @Test
    void shouldNumberMonthsAboveAverage() {
        StatsService Service = new StatsService();
        long[] salesData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = Service.numberMonthsAboveAverage(salesData);
        assertEquals(expected,actual);
    }



}