import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class LaptopController{
    Laptop laptop;

    @RequestMapping("{laptopId}")
    public Laptop getLaptopDetails(int laptopId){
        return laptop;
    }

    @GetMapping()
    public List<Laptop> getLaptopListDetails(){

    }

    @PostMapping
}