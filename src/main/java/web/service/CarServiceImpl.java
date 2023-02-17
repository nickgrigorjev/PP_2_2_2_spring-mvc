package web.service;


import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService{
    private List<Car> cars = new ArrayList<>(){};

    public CarServiceImpl() {
        cars.add(new Car("Toyota", 156,"red"));
        cars.add(new Car("BMW", 543,"yellow"));
        cars.add(new Car("Honda", 725,"black"));
        cars.add(new Car("Renault", 126,"white"));
        cars.add(new Car("Volvo", 752,"green"));
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCarsByAmount(int amount) {
        return cars.stream().limit(amount).collect(Collectors.toList());
    }
}
