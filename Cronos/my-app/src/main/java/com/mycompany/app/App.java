package com.mycompany.app;

public class App 
{
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
        System.out.println( "Max double: " + Double.MAX_VALUE );
    }
{ // Add an opening curly brace here
    }
}
