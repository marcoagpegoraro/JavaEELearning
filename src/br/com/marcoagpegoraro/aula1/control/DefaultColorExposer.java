package br.com.marcoagpegoraro.aula1.control;

import br.com.marcoagpegoraro.aula1.entity.Color;

import javax.enterprise.inject.Produces;
import javax.inject.Named;


public class DefaultColorExposer {

//    @Produces
//    private Color defaultColor;

    @Produces
//    @Named("diesel")
    @Diesel
    public Color exposeDefaultColor(){
        return Color.RED;
    }

}
