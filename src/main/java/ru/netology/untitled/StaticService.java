package ru.netology.untitled;

//Сумму всех продаж
public class StaticService {
    public long amountMonth(long[] sales) {
        long amountMonth = 0;

        for (long sale : sales) {
            amountMonth += sale;

        }
        return amountMonth;

    }

//Среднюю сумму продаж в месяц


    public long averageNumber(long[] sales) {

        long amountMonth = amountMonth(sales);

        return amountMonth / 12;
    }

    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
//Пик продаж 5,7 месяц , как сделать что бы выдать два числа ?
    public int maxxSales(long[] sales) {
        int maxxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxxMonth]) {
                maxxMonth = i;
            }
        }
        return maxxMonth;
    }

    //Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int miniSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth])
                minMonth = i;
        }
        return minMonth;
    }


//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

    public int minAverageSales(long[] sales) {
        int minAverage = 0;
        long amo = averageNumber(sales);
        for (long sale : sales) {
            if (sale < amo) {
                minAverage++;

            }
        }
        return minAverage;
    }
    //Кол-во месяцев, в которых продажи были выше среднего (см. п.2)

    public int maxAverageSales(long[] sales) {
        int maxAverage = 0;
        long amo = averageNumber(sales);
        for (long sale : sales) {
            if (sale > amo) {
                maxAverage++;

            }
        }
        return maxAverage;
    }
}