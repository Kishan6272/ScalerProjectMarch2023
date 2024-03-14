package myfirstscalerspringboot.com.productservicescalermarch102024.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
//    id:1,
//    title:'...',
//    price:'...',
//    category:'...',
//    description:'...',
//    image:'...'

    private Long id;
    private String title;
    private String description;
    private double price;
    private String imageURL;
    private Category category;
}
