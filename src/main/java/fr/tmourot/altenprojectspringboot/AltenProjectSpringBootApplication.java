package fr.tmourot.altenprojectspringboot;

import fr.tmourot.altenprojectspringboot.entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AltenProjectSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(AltenProjectSpringBootApplication.class, args);
        System.out.println("AltenProjectSpringBootApplication started");
        Product product = new Product();
        System.out.println("Product: " + product);
    }

}
