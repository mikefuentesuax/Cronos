package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monitor {
    public double radiationLevel = 0.0;
    public double temperature = 0.0;
    public double pressure = 0.0;

    List<Integer> criticalEvents = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

    public void monitorVariables() {
        if (radiationLevel > 100 || temperature > 50 || pressure > 1000) {
            System.out.println("Alert: Critical levels detected");
        }
    }

    public void identifyCriticalEvents(int n) {
        if (criticalEvents.contains(n)) {
            System.out.println("Alert: Critical event " + n + " detected");
        }
    }

    public List<Integer> decomposeProblem(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        return factors;
    }
}
