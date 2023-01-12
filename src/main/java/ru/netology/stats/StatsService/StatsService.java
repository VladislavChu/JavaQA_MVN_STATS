package ru.netology.stats.StatsService;
public class StatsService {
    public int sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int averageSales(long[] sales) {
        int average = 0;
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        average = sum / sales.length;
        return average;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            if (sales[maxMonth] <= sale) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int aboveAverageSales(long[] sales) {
        int aboveAverage = 0;
        int newAverage = averageSales(sales);
        for (long sale : sales) {
            if (sale > newAverage) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }


    public int belowTheAverageSales(long[] sales) {
        int belowAverage = 0;
        int newAverage = averageSales(sales);
        for (long sale : sales) {
            if (sale > newAverage) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }


}
