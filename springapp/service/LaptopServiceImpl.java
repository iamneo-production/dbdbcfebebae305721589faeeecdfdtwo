package home.coder.project.workspace.springapp.service;

import home.coder.project.workspace.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LaptopServiceImpl implements ApiService {
    private List<Laptop> laptops = new ArrayList<>();

    @Override
    public Laptop getLaptopById(int laptopId) {
        for (Laptop laptop : laptops) {
            if (laptop.getLaptopId() == laptopId) {
                return laptop;
            }
        }
        return null;
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptops;
    }

    @Override
    public boolean createLaptop(Laptop laptop) {
        return laptops.add(laptop);
    }
}
