package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @SuppressWarnings("deprecation")
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
    double expected2 = 2.5;
    int sum = calculate.sum(2, 3);
    assertEquals(expected2, calculate.ave(sum, 2), 0);

    expected = 55;
    sum = calculate.sumto(1, 10);
    assertEquals(expected, sum);
    expected2 = 5.5;
    assertEquals(expected2, calculate.ave(sum, 10), 0);

    expected = 25;
    sum = calculate.sumodd(1, 10);
    assertEquals(expected, sum);
    expected = 30;
    sum = calculate.sumeven(1, 10);
    assertEquals(expected, sum);
    
  }

}
