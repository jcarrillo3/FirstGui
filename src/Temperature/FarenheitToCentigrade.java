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
public class FarenheitToCentigrade implements TemperatureConverterStrategy{

    @Override
    public String convertTemperature(double temperature) {
        DecimalFormat df = new DecimalFormat("#.##");
        double centigrade = (temperature - 32)/1.8;
        
        return df.format(centigrade);
    }
    
}
