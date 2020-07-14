package ru.netology.stats;

// Статистика - очень важный компонент любого бизнеса. У вас есть набор данных о продажах конкретного предприятия по месяцам: [8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18].
//
//        Вам поручили написать небольшой сервис (программисты все заняты), который умеет рассчитывать:
//
//        Сумму всех продаж - total sales
//        Среднюю сумму продаж в месяц - average monthly sales
//        Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)* - max month
//        Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)* - min month
//        Кол-во месяцев, в которых продажи были ниже среднего (см. п.2) - The number of months in which sales were below average
//        Кол-во месяцев, в которых продажи были выше среднего (см. п.2) - The number of months in which sales were above average

public class StatsService {

    public long totalSales(long[]salesData) {
        long sum = 0;
        for (long sales : salesData) {
            sum += sales;
        }
        return sum;
    }

    public long monthAverageSales(long[] salesData) {
        long sum = totalSales(salesData);
        return sum/12;
    }

    public long maxSales(long[] salesData) {
        long currentMax = salesData[0];
        int numberMonth = 0;  // номер месяца
        for (int i = 0; i < salesData.length; i++) {
            if (currentMax <= salesData[i]) {
                currentMax = salesData[i];
                numberMonth = i+1;
            }
        }
        return numberMonth;
    }

    public long minSales(long[] salesData) {
        long currentMin = salesData[0];
        int numberMonth = 0;  // номер месяца
        for (int i = 0; i < salesData.length; i++) {
            if (currentMin >= salesData[i]) {
                currentMin = salesData[i];
                numberMonth = i+1;
            }
        }
        return numberMonth;
    }

    public long numberMonthsBelowAverage(long[] salesData) {
//        StatsService service = new StatsService();
//        long averageSum = service.monthAverageSales(salesData);
        long averageSum = monthAverageSales(salesData); // средние продажи

        int number = 0;  // количество месяцев
        for (long sales : salesData) {
            if (averageSum > sales) {  // продажи ниже среднего
                number++;
            }
        }
        return number;
    }

    public long numberMonthsAboveAverage(long[] salesData) {
        long averageSum = monthAverageSales(salesData); // средние продажи
        int number = 0;  // количество месяцев
        for (long sales : salesData) {
            if (averageSum < sales) {  // продажи выше среднего
                number++;
            }
        }
        return number;
    }

}
