package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyAtLessMaxCashBack() {

        int actual = service.remain(750);
        int expected = 250;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt1() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt999() {


        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt2500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2500);
        int expected = 500;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt0() {


        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);

    }
    @Test
    public void shouldBuyToMaxCashBackBuyingAt5000() {

        int actual = service.remain(5000);
        int expected = 0;

        assertEquals(actual, expected);

    }
}