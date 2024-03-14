package myfirstscalerspringboot.com.productservicescalermarch102024.dtos;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateProductRequestDto {

//    title: 'test product',
//    price: 13.5,
//    description: 'lorem ipsum set',
//    image: 'https://i.pravatar.cc',
//    category: 'electronic'

   // private Long id;
    private String title;
    private String category;
    private String description;
    private double price;
    private String image;
    private Long userId;


}


// DTO for each request we make class
// so than if any parameter is required to add in future could be easily done