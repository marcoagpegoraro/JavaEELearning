package br.com.marcoagpegoraro.aula1.control;

import br.com.marcoagpegoraro.aula1.entity.Car;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {

    @Transactional
    public void store(Car car){

    }

    @Transactional
    public List<Car> loadCars(){
        return new ArrayList<Car>();
    }
}
