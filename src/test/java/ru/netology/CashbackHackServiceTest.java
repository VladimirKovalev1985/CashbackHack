package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldService0() {

        assertEquals(service.remain(0), 1000);



    }
}