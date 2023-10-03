package home.coder.project.workspace.springapp.controller;

import home.coder.project.workspace.springapp.model.Laptop;
import home.coder.project.workspace.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
public class LaptopController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable int laptopId) {
        return apiService.getLaptopById(laptopId);
    }

    @GetMapping("/")
    public List<Laptop> getAllLaptops() {
        return apiService.getAllLaptops();
    }

    @PostMapping("/")
    public boolean createLaptop(@RequestBody Laptop laptop) {
        return apiService.createLaptop(laptop);
    }
}