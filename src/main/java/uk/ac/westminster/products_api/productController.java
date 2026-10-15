package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/products")
public class productController {
    @GetMapping("/{id}")
    public products getById(@PathVariable Long id) {
        return new products(id, "Laptop", 999.99);
    }
}

