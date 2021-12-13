package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldService0() {

        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldService1000() {

        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldServiceMore1000() {

        assertEquals(service.remain(1100), 900);
    }

    @Test
    public void shouldServiceLess1000() {

        assertEquals(service.remain(600), 400);

    }


}