package com.mbc.photos.shop.cli;
import com.mbc.photos.shop.domain.Product;
import com.mbc.photos.shop.service.ProductService;
import java.util.*;

public class CliController {

    private ProductService productService;

    public CliController(ProductService productService) {
        this.productService = productService;
    }

    public void start() {
        System.out.println("--------------------");
        System.out.println("1 - Afficher l'ensemble des livres");
        System.out.println("2 - Rechercher les livres par leurs noms");
        System.out.println("3 - Rechercher les livres par leurs prix");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();


        switch(choice) {
            case "1":
                List<Product> allBooks = productService.findAll();
                for (Product currentBook : allBooks) {
                    System.out.println(currentBook);
                }
                break;
            case "2":
                String searchByname = scanner.next();
                productService.searchByProductName(searchByname).forEach(product -> System.out.println(product));
                break;
            case "3":
                String searchByPrice = scanner.next();
                productService.searchByProductPrice(Double.valueOf(searchByPrice)).forEach(product -> System.out.println(product));
                break;
            default:
                System.out.println("Cette commande n'existe pas");
        }


    }
}
