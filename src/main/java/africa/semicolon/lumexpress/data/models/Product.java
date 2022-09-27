package africa.semicolon.lumexpress.data.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
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
    private BigDecimal price;
    private int quantity;
    @ElementCollection
    private List<Category> categories;
    private String imageUrl;
}
