package web.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.Service.CarService;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    public CarController (CarService carService) {
        this.carService = carService;
    }


        @GetMapping("/cars")
    public String getCars (@RequestParam(required = false, defaultValue = "5") int count, Model model) {
            List<Car> cars = carService.getCars(count);
            model.addAttribute("cars", cars);
            return "car";
        }
}
