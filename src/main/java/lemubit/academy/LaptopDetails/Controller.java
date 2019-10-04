package lemubit.academy.LaptopDetails;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Controller {

    List<Laptop> laptopList = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "Hello!";
    }

    @GetMapping("/laptops")
    public List<Laptop> getAllLaptops()
    {
        return laptopList;
    }

    @PostMapping("/laptop/new")
    public String addLaptop(@RequestBody Laptop laptop)
    {
        laptopList.add(laptop);
        return "New Laptop Added";
    }

    @PostMapping("/laptops/new")
    public String addLaptops(@RequestBody List<Laptop> laptops)
    {
        laptopList.addAll(laptops);
        return "All Laptops Added";
    }

    @GetMapping("/laptops/search")
    public List<Laptop> priceRange(@RequestParam int greaterThan)
    {
        return laptopList.stream()
                .filter(laptop -> laptop.price>greaterThan)
                .collect(Collectors.toList());
    }




}
