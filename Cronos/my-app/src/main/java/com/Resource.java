package com ;

public class Resource 
{
    String name;
    double dailyConsumption; // Consumo diario del recurso

    // Constructor
    public Resource(String name, double dailyConsumption) {
        this.name = name;
        this.dailyConsumption = dailyConsumption;
    }

    // Calcular el consumo del recurso para un número de días
    public double calculateConsumption(int days) {
        return dailyConsumption * days;
    }

    // Calcular el consumo del recurso para un número de semanas
    public double calculateConsumptionWeeks(int weeks) {
        return calculateConsumption(weeks * 7);
    }

    // Calcular el consumo del recurso para un número de meses
    public double calculateConsumptionMonths(int months) {
        return calculateConsumption((int)(months * 30.44)); // Aproximación del número de días en un mes
    }
}