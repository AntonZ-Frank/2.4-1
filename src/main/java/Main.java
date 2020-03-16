import ru.netology.stats.StatsService;
public class Main {
    public static void main(String[] args) {
        int[] salesInfos = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService calcService = new StatsService();
        int sum = calcService.calculateSumAndMidelSum(salesInfos);
        System.out.println("Сумма всех продаж: "+ sum);
        int midelsum = sum / 12;
        System.out.println("Средняя сумма продаж в месяц: "+ midelsum);

        int lowMonth = calcService.calculatelowMonth(salesInfos, midelsum);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + lowMonth);

        int highMonth = calcService.calculatehighMonth(salesInfos, midelsum);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + highMonth);

        int highPayment = calcService.calculateHowHighPayment(salesInfos);
        System.out.println("Номер месяца, в котором был пик продаж: " + highPayment);

        int lowPayment = calcService.calculateHowLowPayment(salesInfos);
        System.out.println("Номер месяца, в котором был минимум продаж: " + lowPayment);
        }
}





