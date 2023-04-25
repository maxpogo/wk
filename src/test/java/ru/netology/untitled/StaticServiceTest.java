package ru.netology.untitled;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StaticServiceTest {
    @Test

    public void shouldAmountMonth() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.amountMonth(sales);
        long expected = 180;

        assertEquals(expected, actual);


    }
////

    @Test
    public void shouldAverageNumber() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.amountMonth(sales) / 12;
        long expected = 15;
        assertEquals(expected, actual);

    }


    @Test
    public void shouldMaxxSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxxSales(sales);
        long expected = 7;

        assertEquals(expected, actual);


    }


    @Test
    public void shouldMiniSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.miniSales(sales);
        long expected = 8;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldMinAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minAverageSales(sales);
        long expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldMaxAverageSales() {
        StaticService service = new StaticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minAverageSales(sales);
        long expected = 5;

        assertEquals(expected, actual);

    }
}