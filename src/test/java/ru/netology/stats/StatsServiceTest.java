package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void countSum() {
        StatsService service=new StatsService();
        int [] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(monthResult);
        int expected = 8+15+13+15+17+20+19+20+7+14+14+18;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void countAverage() {
        StatsService service = new StatsService();
        int[] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.findSum(monthResult) / monthResult.length;
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / monthResult.length;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMaxMonth() {
        StatsService service = new StatsService();
        int[] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxSales(monthResult);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMinMonth() {
        StatsService service = new StatsService();
        int[] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minSales(monthResult);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void findMonthBelowAverage() {
        StatsService service = new StatsService();
        int[] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowAverage(monthResult);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMonthOverAverage() {
        StatsService service = new StatsService();
        int[] monthResult = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.overAverage(monthResult);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
