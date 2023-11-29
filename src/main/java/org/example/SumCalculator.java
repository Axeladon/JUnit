package org.example;

public class SumCalculator {

    public int sum(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException();
        }

        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }
}
