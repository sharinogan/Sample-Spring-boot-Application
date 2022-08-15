package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Service {
    
    @RequestMapping("/stadium-detail")
    Stadium m2() {
        return new Stadium("Stamford Bridge", 45000);
    }
    
    @RequestMapping("/captain")
    Player m1() {
        Player p = new Player();
        p.name = "David Beckham";
        p.number = 7;
        p.salary = 45000.00;
        return p;
    }   
}

record Stadium(String name, int seat) { }

class Player {
    public String name;
    public int number;
    double salary;
}
