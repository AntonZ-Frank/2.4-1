package ru.netology.stats;

public class StatsService {
    public static int calculateSumAndMidelSum(int[] salesInfos)  {
    int sum = 0;
    for (int salesInfo : salesInfos) {
        sum += salesInfo;
    }
        return sum;
     }

    public static int calculatelowMonth(int[] salesInfos, int midelsum) {
           int lowMonth = 0;
       for (int salesInfo : salesInfos) {
           if ( salesInfo < midelsum)
           {lowMonth += 1;}
       }
        return lowMonth;
    }

    public static int calculatehighMonth(int[] salesInfos, int midelsum) {
                int highMonth = 0;
        for (int salesInfo : salesInfos) {
            if ( salesInfo > midelsum)
            {highMonth += 1;}
        }
        return highMonth;
    }
    public static int calculateHowHighPayment(int[] salesInfos) {
        int highPayment = 0;
       int max = salesInfos[0];
        for (int i = 0; i < salesInfos.length; i++) {
            int salesInfo = salesInfos[i];
            if (max <= salesInfo) {
                max = salesInfo;
                highPayment = i;
            }
        }
        return highPayment + 1; //Прибавляем 1 т.к. #месяца начинается с 1го, а массив с 0.
    }
    public static int calculateHowLowPayment(int[] salesInfos) {

        int lowPayment = 0;
        int min = salesInfos[0];
        for (int i = 0; i < salesInfos.length; i++) {
            int salesInfo = salesInfos[i];
            if (min >= salesInfo) {
                min = salesInfo;
                lowPayment = i;
            }
        }
        return lowPayment + 1; //Прибавляем 1 т.к. #месяца начинается с 1го, а массив с 0.
    }
}






