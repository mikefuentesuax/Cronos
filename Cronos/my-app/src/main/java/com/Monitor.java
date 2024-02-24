package com ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monitor {
    double radiationLevel = 0.0;
    double temperature = 0.0;
    double pressure = 0.0;

    List<Integer> criticalEvents = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29));

    void monitorVariables() {
        if (radiationLevel > 100 || temperature > 50 || pressure > 1000) {
            System.out.println("Alert: Critical levels detected");
        }
    }

    void identifyCriticalEvents(int n) {
        if (criticalEvents.contains(n)) {
            System.out.println("Alert: Critical event " + n + " detected");
        }
    }

    