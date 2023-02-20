package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarController {

    private CarService carService = new CarServiceImp();

    @GetMapping("/cars")
    public String getListCars(@RequestParam(defaultValue = "-1") String count, Model model) {
        model.addAttribute("cars", carService.getCars(Integer.valueOf(count)));
        return "cars";
    }
}
