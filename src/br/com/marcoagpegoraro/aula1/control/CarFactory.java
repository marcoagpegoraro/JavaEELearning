package br.com.marcoagpegoraro.aula1.control;

import br.com.marcoagpegoraro.aula1.entity.Car;
import br.com.marcoagpegoraro.aula1.entity.Color;
import br.com.marcoagpegoraro.aula1.entity.Specification;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.UUID;

//@ApplicationScoped
//@RequestScoped
@Dependent
public class CarFactory {

    @Inject
    @Diesel
    Color defaultCarColor;

    public Car createCar(Specification specification) {
        final Car car = new Car();
        car.setId(UUID.randomUUID().toString());
        car.setEngineType(specification.getEngineType());
        car.setColor(specification.getColor() == null ? defaultCarColor : specification.getColor());
        return car;
    }
}