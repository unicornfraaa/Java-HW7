package ru.netology.stats;

public class StatsService {
    public long sumOfAllSales(long[] sales) {
        long allSales = 0;
        for (long sale : sales) {
            allSales = sale + allSales;
        }
        return allSales;
    }


    public long averageSumOfAllSales(long[] sales) {
        long allSales = sumOfAllSales(sales);
        return allSales / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
           if (sales[i] >= sales[maxMonth]) {
               maxMonth = i;
           }
        }
        return maxMonth +1;
    }


    public int minSalesMonth(long[] sales) {
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
    public int belowTheAverage(long[] sales) {
        long average = averageSumOfAllSales(sales);
        int mount = 0;
        for (long sale : sales) {
            if (sale < average) {
                mount++;
            }
        }
        return mount;
    }


    public int aboveTheAverage(long[] sales) {
        long average = averageSumOfAllSales(sales);
        int mount = 0;
        for (long sale : sales) {
            if (sale > average) {
                mount++;
            }
        }
        return mount;
    }
}
