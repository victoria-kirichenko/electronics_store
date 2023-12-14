package edu.com.controller;

import edu.com.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CatalogController {

    @Autowired
    private ProductService productService;

    @GetMapping("/catalog")
    public String showCatalog(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "catalog";
    }

    @GetMapping("/category/{category}")
    public String showCategory(@PathVariable String category, Model model) {
        int categoryID;
        if (category.equals("smartphones")) {
            categoryID = 1;
        } else if (category.equals("laptops")) {
            categoryID = 2;
        } else {
            categoryID = 3;
        }
        model.addAttribute("products", productService.getProductsByCategory(categoryID));
        return "catalog";
    }

    @GetMapping("/product-details/{productId}")
    public String getProductDetails(@PathVariable Long productId, Model model) {
        model.addAttribute("products", productService.getProductById(productId));
        return "product-details";
    }

}
