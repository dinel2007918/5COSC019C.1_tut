
package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<products> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public products getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElse(null);
    }

    @PostMapping("/products")
    public products addProduct(@RequestBody products product) {
        return productService.addProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/products/search")
    public List<products> search(@RequestParam String name) {
        return productService.findByName(name);
    }
}
