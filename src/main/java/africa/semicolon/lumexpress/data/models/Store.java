package africa.semicolon.lumexpress.data.models;

import lombok.*;

import javax.persistence.*;
import java.util.Set;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private Set<Product> products;
}
