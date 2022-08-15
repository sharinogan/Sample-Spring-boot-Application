package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
class C1 {
    
    @RequestMapping({"/products", "/product"})
    String[] m1() {
        String[] data = {"Latte", "Mocha", "Cappucino"};
        return data;
    }
    
    // http://localhost:15000/coffee/get-total?price=220.0&tip=15.0
    
    @RequestMapping("/get-total")
    String m2(String price, String tip) {
        try {
            double p = Double.valueOf(price);
            double t = Double.valueOf(tip);
            return "" + ((p * t / 100) + p);
        } catch (Exception e) {
            return "Invalid-data";
        }       
    }
}
