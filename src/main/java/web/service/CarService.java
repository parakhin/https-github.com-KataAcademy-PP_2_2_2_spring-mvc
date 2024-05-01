package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarDao carDao;

    public List<Car> index() {
        return carDao.index();
    }

    public List<Car> index(int count) {
        return carDao.index(count);
    }
}
