package web.Service;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {

    List <Car> cars = new ArrayList<>();

    {
        cars.add(new Car("BMW", "Yellow", 5));
        cars.add(new Car("Mercedes", "White", 9));
        cars.add(new Car("Audi", "Black", 7));
        cars.add(new Car("Skoda", "Green", 1));
        cars.add(new Car("Toyota", "Red", 7));
    }

    public List <Car> getCars (int count) {
        if ( count >= 5)  return cars;
        return cars.subList(0,count);

    }

}
