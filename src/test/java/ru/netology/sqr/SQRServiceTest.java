package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void test () {
        SQRService service = new SQRService();

        int actual = service.calcNumbers(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}