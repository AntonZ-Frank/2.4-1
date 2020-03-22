import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService calcService = new StatsService();
        int sum = calcService.calculateSumAndMid(salesInfos);
        System.out.println("Сумма всех продаж: " + sum);
        System.out.println("Средняя сумма продаж в месяц: " + sum / 12);
        int lowMonth = calcService.calculateLowMonth(salesInfos);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + lowMonth);
        int highMonth = calcService.calculateHighMonth(salesInfos);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + highMonth);
        int highPayment = calcService.calculateHowHighPayment(salesInfos);
        System.out.println("Номер месяца, в котором был пик продаж: " + highPayment);
        int lowPayment = calcService.calculateHowLowPayment(salesInfos);
        System.out.println("Номер месяца, в котором был минимум продаж: " + lowPayment);
    }
}





