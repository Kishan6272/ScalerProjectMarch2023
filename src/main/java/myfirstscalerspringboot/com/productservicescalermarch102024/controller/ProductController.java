package myfirstscalerspringboot.com.productservicescalermarch102024.controller;


import myfirstscalerspringboot.com.productservicescalermarch102024.dtos.CreateProductRequestDto;
import myfirstscalerspringboot.com.productservicescalermarch102024.model.Product;
import myfirstscalerspringboot.com.productservicescalermarch102024.services.FakeStoreProductService;
import myfirstscalerspringboot.com.productservicescalermarch102024.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

//   private Map<Integer,Integer> mp= new HashMap<>();
//   List<Integer> li=new ArrayList<>();

  private ProductService productService;

  public ProductController(ProductService productService)
  {
      this.productService=productService;
  }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto)
    {
      return productService.createProduct(
              requestDto.getTitle(),
              requestDto.getCategory(),
              requestDto.getPrice(),
              requestDto.getDescription(),
              requestDto.getImage()
      );
    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId )
    {
      return productService.getSingleProduct(productId);
    }
    @GetMapping("/products/{id}")
    public List<Product> getAllProduct(@PathVariable("id") Long productId )
    {
       return productService.getProducts();
    }

    public void updateProduct()
    {

    }

}
