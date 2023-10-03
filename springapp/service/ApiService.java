
package home.coder.project.workspace.springapp.service;

import com.example.demo.model.Laptop;
import java.util.List;

public interface ApiService {
    Laptop getLaptopById(int laptopId);

    List<Laptop> getAllLaptops();

    boolean createLaptop(Laptop laptop);
}