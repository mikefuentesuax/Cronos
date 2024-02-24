package com.mycompany.app;

import com.Resource;

public class App 
{
    //Ejercicio Del Cronometro 
    //
    // Definir las conversiones de tiempo para el nuevo planeta
    static double earthSecondsInDay = 86400; // 24 hours * 60 minutes * 60 seconds
    static double earthDaysInYear = 365.25; // Including leap year

    static double planetSecondsInDay = 87000; // Hypothetical value, replace with actual value
    static double planetDaysInYear = 400; // Hypothetical value, replace with actual value

    public static void main( String[] args )
    {
        // Tiempo en la Tierra
        double earthSeconds = 60;
        double earthMinutes = earthSeconds / 60;
        double earthHours = earthMinutes / 60;
        double earthDays = earthHours / 24;
        double earthYears = earthDays / 365.25;

        // Convertir el tiempo a los equivalentes en el nuevo planeta
        double planetSeconds = earthSeconds * (planetSecondsInDay / earthSecondsInDay);
        double planetMinutes = planetSeconds / 60;
        double planetHours = planetMinutes / 60;
        double planetDays = planetHours / 24;
        double planetYears = planetDays / planetDaysInYear;

        // Imprimir los resultados
        System.out.println( "Tiempo en el nuevo planeta:" );
        System.out.println( "Segundos: " + planetSeconds );
        System.out.println( "Minutos: " + planetMinutes );
        System.out.println( "Horas: " + planetHours );
        System.out.println( "Días: " + planetDays );
        System.out.println( "Años: " + planetYears );

        // Imprimir los límites de representación de datos
        System.out.println( "Límites de representación de datos:" );
        System.out.println( "Max int: " + Integer.MAX_VALUE );
        System.out.println( "Max long: " + Long.MAX_VALUE );
        System.out.println( "Max float: " + Float.MAX_VALUE );
        System.out.println( "Max double: " + Double.MAX_VALUE + "\n");



        //Ejercicio de Recursos

        // Crear recursos
        Resource water = new Resource("Agua", 2); // 2 litros de agua por día
        Resource food = new Resource("Comida", 1.5); // 1.5 kg de comida por día
        Resource oxygen = new Resource("Oxigeno", 0.84); // 0.84 kg de oxígeno por día

        // Calcular y imprimir el consumo de recursos para 5 días, 5 semanas y 5 meses
        System.out.println("Consumo de recursos para 5 días, 5 semanas y 5 meses:");
        printConsumption(water, 5);
        printConsumption(food, 5);
        printConsumption(oxygen, 5);
    }


    // Método para imprimir el consumo de un recurso para un número de días, semanas y meses
    public static void printConsumption(Resource resource, int multiplier) {
        System.out.println(resource.getName() + ":");
        System.out.println("Días: " + resource.calculateConsumption(multiplier));
        System.out.println("Semanas: " + resource.calculateConsumptionWeeks(multiplier));
        System.out.println("Meses: " + resource.calculateConsumptionMonths(multiplier));
        System.out.println();
    }

    public static class Resource {
        private String name;
        private double consumption;

        public Resource(String name, double consumption) {
            this.name = name;
            this.consumption = consumption;
        }

        public String getName() {
            return name;
        }

        public double calculateConsumption(int multiplier) {
            return consumption * multiplier;
        }

        public double calculateConsumptionWeeks(int multiplier) {
            return calculateConsumption(multiplier) / 7;
        }

        public double calculateConsumptionMonths(int multiplier) {
            return calculateConsumption(multiplier) / 30;
        }
    }
}
