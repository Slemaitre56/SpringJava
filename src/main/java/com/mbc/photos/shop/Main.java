package com.mbc.photos.shop;
import com.mbc.photos.shop.cli.CliController;
import com.mbc.photos.shop.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = applicationContext.getBean(ProductService.class);
        initData(productService);
        CliController cliController = applicationContext.getBean(CliController.class);
        cliController.start();

    }

    private static void initData(ProductService productService) {
        productService.add("Photo de Lion", 19.99, "Photo de Lion", 5, "image de Lion");
        productService.add("Photo de Serpent", 69.99, "Photo de Serpent", 5, "image de Serpent");
    }
}
