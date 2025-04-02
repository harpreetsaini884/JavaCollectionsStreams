package org.rituraj.junit.advance;

public class TemperatureConverter {
    public double celsiusToFahrenheit(double temp){
        return (temp * (9.0/5) + 32 );
    }

    public double fahrenheitToCelsius(double temp){
        return ((temp-32)  * (5.0/9));
    }
}
