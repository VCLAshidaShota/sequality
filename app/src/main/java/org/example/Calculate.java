package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int sum, int count) {
    return (double) sum / (double) count;
  }

  public int sumto(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum = sum(sum, i);
    }
    return sum;
  }

  public int sumeven(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sum = sum(sum, i);
      }
    }
    return sum;
  }

  public int sumodd(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sum = sum(sum, i);
      }
    }
    return sum;
  }
}
