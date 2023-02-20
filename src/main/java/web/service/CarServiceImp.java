package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("One", "Tesla", 320));
        cars.add(new Car("Two", "Tesla", 356));
        cars.add(new Car("Three", "Tesla", 250));
        cars.add(new Car("Four", "Tesla", 400));
        cars.add(new Car("Five", "Tesla", 533));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == -1) {
            return cars;
        }
        return new ArrayList<>(cars.stream().limit(count).toList());
    }
}
