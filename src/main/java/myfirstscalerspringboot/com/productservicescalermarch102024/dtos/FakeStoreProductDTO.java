package myfirstscalerspringboot.com.productservicescalermarch102024.dtos;


import lombok.Getter;
import lombok.Setter;
import myfirstscalerspringboot.com.productservicescalermarch102024.model.Category;
import myfirstscalerspringboot.com.productservicescalermarch102024.model.Product;

@Getter
@Setter
public class FakeStoreProductDTO {
//
//    {
//        id:1,
//                title:'...',
//            price:'...',
//            category:'...',
//            description:'...',
//            image:'...'
//    }

    private Long id;
    private String title;
    private String category;
    private String description;
    private double price;
    private String image;


    public Product toProduct()
    {   Product product=new Product();

        product.setId(id);
        product.setTitle(title);
        product.setDescription(description);
        product.setImageURL(image);
        product.setPrice(price);

        Category productCategory=new Category();
        product.setTitle(category);
        product.setCategory(productCategory);

        return product;

    }

}
