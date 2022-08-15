package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

class Start {

    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        Cryptocurrency x = context.getBean("bitcoin",Cryptocurrency.class);
        System.out.println(x.symbol);
        System.out.println(x.rate);
        SpringApplication.exit(context);
    }
}

@SpringBootApplication
class Setup {

    @Bean("ethereum")
    Cryptocurrency create() {
        Cryptocurrency c = new Cryptocurrency();
        c.symbol = "ETH/USD";
        c.rate = 1925.00;
        return c;
    }

    // Create another bean, with BTC/USD
    @Bean("bitcoin")
    Cryptocurrency bitcoin() {
        Cryptocurrency c = new Cryptocurrency();
        c.symbol = "ฺBTC/USD";
        c.rate = 2000.00;
        return c;
    }
}

class Cryptocurrency {

    String symbol;
    double rate;
}
