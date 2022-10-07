package africa.semicolon.lumexpress.data.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String descriptiom;
    private double price;
    private int quantity;
    private int statusCode;
    @ElementCollection(fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();
    private String imageUrl;
}
