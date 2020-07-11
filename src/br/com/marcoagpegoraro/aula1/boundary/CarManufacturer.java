package br.com.marcoagpegoraro.aula1.boundary;

import br.com.marcoagpegoraro.aula1.control.CarFactory;
import br.com.marcoagpegoraro.aula1.entity.Car;
import br.com.marcoagpegoraro.aula1.entity.CarCreated;
import br.com.marcoagpegoraro.aula1.entity.Specification;
import br.com.marcoagpegoraro.aula1.control.CarRepository;

import javax.ejb.Singleton;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import java.util.List;

@Stateless
//@Stateful
//@Singleton
public class CarManufacturer {

    @Inject
    CarFactory carFactory;

    @Inject
    CarRepository carRepository;

    @Inject
    Event<CarCreated> carCreated;

    public Car manufactureCar(Specification specification){
        final Car car = carFactory.createCar(specification);

        //store in database here

        carRepository.store(car);
        carCreated.fire(new CarCreated(car.getId()));
        return car;
    }

    private Car createCar(Specification specification){
        return carFactory.createCar(specification);
    }

    public List<Car> retriveCars(){
        return carRepository.loadCars();
    }

}
