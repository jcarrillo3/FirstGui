/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

/**
 *
 * @author Juan
 */
public interface TemperatureConverterStrategy {
    
    public abstract String convertTemperature(double temperature);
}
