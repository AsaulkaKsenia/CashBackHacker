package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuyLessMaxCashBack() {

        int actual = service.remain(750);
        int expected = 250;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt999() {

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt1001() {


        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt2500() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(2500);
        int expected = 500;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt0() {


        int actual = service.remain(0);
        int expected = 1000;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt1000() {

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBuyToMaxCashBackBuyingAt5000() {

        int actual = service.remain(5000);
        int expected = 0;

        assertEquals(expected, actual);

    }
}