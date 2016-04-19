/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

import java.text.DecimalFormat;

/**
 *
 * @author Juan
 */
public class CentigradeToFarenheit implements TemperatureConverterStrategy{

    @Override
    public String convertTemperature(double temperature) {
        DecimalFormat df = new DecimalFormat("#.##");
        double farenheit = (temperature * 1.8) + 32;
        
        return df.format(farenheit);
    }
    
}
