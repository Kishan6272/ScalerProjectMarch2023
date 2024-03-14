package myfirstscalerspringboot.com.productservicescalermarch102024.services;

import myfirstscalerspringboot.com.productservicescalermarch102024.dtos.FakeStoreProductDTO;
import myfirstscalerspringboot.com.productservicescalermarch102024.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service

public class FakeStoreProductService implements ProductService{


    //@RestTemplate
    // allow to sent http request and work with the respons

    private RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate)
    {
        this.restTemplate=restTemplate;
    }
    @Override
    public Product getSingleProduct(Long productId) {
        FakeStoreProductDTO fakeStoreProductDTO=restTemplate.getForObject(
                "https://fakestoreapi.com/products/1"+productId,
                FakeStoreProductDTO.class);
        return null;
    }

    @Override
    public List<Product> getProducts() {
        List <FakeStoreProductDTO> fakeStoreProducts=restTemplate.getForObject(
                "https://fakestoreapi.com/products",
                List <FakeStoreProductDTO>.class
        );

        List<Product> products=new ArrayList<>();
        for(FakeStoreProductDTO fakeStoreProduct:fakeStoreProducts){
            products.add(fakeStoreProduct.toProduct());
        }
        return products;
    }

    @Override
    public Product createProduct(String title,
                                 String description,
                                 double price,
                                 String category,
                                 String image) {
        FakeStoreProductDTO fakeStoreProductDTO=new FakeStoreProductDTO();
        fakeStoreProductDTO.setTitle(title);
        fakeStoreProductDTO.setCategory(category);
        fakeStoreProductDTO.setDescription(description);
        fakeStoreProductDTO.setPrice(price);
        fakeStoreProductDTO.setImage(image);

        FakeStoreProductDTO response=restTemplate.postForObject("https://fakestoreapi.com/products",
                fakeStoreProductDTO,
                FakeStoreProductDTO.class
        );
        return response.toProduct();
    }


}
