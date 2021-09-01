package com.mbc.photos.shop;
import com.mbc.photos.shop.cli.CliController;
import com.mbc.photos.shop.dao.ProductDao;
import com.mbc.photos.shop.dao.ProductDaoInMemory;
import com.mbc.photos.shop.service.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ProductService productService = applicationContext.getBean(ProductService.class);
        initData(productService);
        CliController cliController = applicationContext.getBean(CliController.class);
        cliController.start();


        /*
        ProductDao productDao = new ProductDaoInMemory();
        ProductService productService = new ProductService(productDao);
        CliController cliController = new CliController(productService);
        initData(productService);
        cliController.start();
        */
    }

    private static void initData(ProductService productService) {
        productService.add("Photo de Lion", 19.99, "Photo de Lion", 5, "image de Lion");
        productService.add("Photo de Serpent", 69.99, "Photo de Serpent", 5, "image de Serpent");
    }
}
