
package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    void calculateSumAndMidelSum() {
        StatsService calcService = new StatsService();
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = calcService.calculateSumAndMid(salesInfos);
        assertEquals(180, sum);
    }

    @Test
    void calculatelowMonth() {
        StatsService calcService = new StatsService();
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int lowMonth = calcService.calculateLowMonth(salesInfos);
        assertEquals(5, lowMonth);
    }

    @Test
    void calculatehighMonth() {
        StatsService calcService = new StatsService();
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int highMonth = calcService.calculateHighMonth(salesInfos);
        assertEquals(5, highMonth);
    }

    @Test
    void calculateHowHighPayment() {
        StatsService calcService = new StatsService();
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int highPayment = calcService.calculateHowHighPayment(salesInfos);
        assertEquals(8, highPayment);
    }

    @Test
    void calculateHowLowPayment() {
        StatsService calcService = new StatsService();
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int lowPayment = calcService.calculateHowLowPayment(salesInfos);
        assertEquals(9, lowPayment);
    }
}




