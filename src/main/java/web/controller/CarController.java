package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam("count") int count,
                          Model model) {
        System.out.println("До возврата представления");
        if(count >= 5) {
            model.addAttribute("cars",carService.getAllCars());
        } else if(count >=0) {
            model.addAttribute("cars", carService.getCarsByAmount(count));
        }
        System.out.println("До возврата представления");
        return "/cars";
    }
}
