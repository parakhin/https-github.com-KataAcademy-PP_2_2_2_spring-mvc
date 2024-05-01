package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoListImpl implements CarDao {
    private List<Car> cars;

    {
        cars = new ArrayList<>(List.of(
                new Car("Toyota", "Mark X", 2019),
                new Car("Nissan", "Laurel", 2002),
                new Car("Honda", "Accord", 2016),
                new Car("Suzuki", "Solio", 2018),
                new Car("Mitsubishi", "Pajero", 2002)
        ));
    }

    @Override
    public List<Car> index() {
        return cars;
    }

    @Override
    public List<Car> index(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
