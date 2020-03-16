
  package ru.netology.stats;

 import static org.junit.jupiter.api.Assertions.*;

 class StatsServiceTest {
     @org.junit.jupiter.api.Test
     void calculateSumAndMidelSum() {
         StatsService calcService = new StatsService();
         int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         int sum = calcService.calculateSumAndMidelSum(salesInfos);
         int actual = sum;
         int expected = 180;
         assertEquals(expected, actual);
         //System.out.println("Сумма всех продаж (по тесту верно): "+ sum);
     }
     @org.junit.jupiter.api.Test
     void calculatelowMonth() {
         StatsService calcService = new StatsService();
         int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         int midelsum = 15;
         int lowMonth = calcService.calculatelowMonth(salesInfos, midelsum);
         int actual = lowMonth;
         int expected = 5;
         assertEquals(expected, actual);
     }
     @org.junit.jupiter.api.Test
     void calculatehighMonth() {
         StatsService calcService = new StatsService();
         int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         int midelsum = 15;
         int highMonth = calcService.calculatehighMonth(salesInfos, midelsum);
         int actual = highMonth;
         int expected = 5;
         assertEquals(expected, actual);
     }
     @org.junit.jupiter.api.Test
     void calculateHowHighPayment() {
         StatsService calcService = new StatsService();
         int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         int highPayment = calcService.calculateHowHighPayment(salesInfos);
         int actual = highPayment;
         int expected = 8;
         assertEquals(expected, actual);
     }
     @org.junit.jupiter.api.Test
     void calculateHowLowPayment() {
         StatsService calcService = new StatsService();
         int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
         int lowPayment = calcService.calculateHowLowPayment(salesInfos);
         int actual = lowPayment;
         int expected = 9;
         assertEquals(expected, actual);
     }
 }




