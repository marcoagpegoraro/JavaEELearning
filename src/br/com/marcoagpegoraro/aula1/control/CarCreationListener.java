package br.com.marcoagpegoraro.aula1.control;

import br.com.marcoagpegoraro.aula1.entity.CarCreated;

import javax.enterprise.event.Observes;

public class CarCreationListener {
    public void onCarCreation(@Observes CarCreated carCreated){
        System.out.println("New Car Created" + carCreated.getIdentifier());
    }
}
