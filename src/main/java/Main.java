import ru.netology.stats.StatsService.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService sales = new StatsService();

        long[] arr = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long result = sales.minSales(arr);
        long result2 = sales.sumSales(arr);
        long result3 = sales.averageSales(arr);
        long result4 = sales.maxSales(arr);
        long result5 = sales.aboveAverageSales(arr);
        long result6 = sales.belowTheAverageSales(arr);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
