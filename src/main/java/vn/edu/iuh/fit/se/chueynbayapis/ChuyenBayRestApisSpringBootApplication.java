package vn.edu.iuh.fit.se.chueynbayapis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class
})
public class ChuyenBayRestApisSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuyenBayRestApisSpringBootApplication.class, args);
    }


}
