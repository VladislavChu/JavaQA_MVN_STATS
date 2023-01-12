package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void IsSumSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = service.sumSales(arr);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void IsAverageSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = service.averageSales(arr);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void IsMinSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IsMaxSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IsBelowTheAverageSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.belowTheAverageSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void IsAboveAverageSalesCorrect() {
        StatsService service = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.aboveAverageSales(arr);

        Assertions.assertEquals(expected, actual);
    }
}
