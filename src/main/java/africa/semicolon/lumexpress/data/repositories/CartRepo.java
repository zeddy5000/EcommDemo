package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface CartRepo extends JpaRepository<Cart,Long> {
}
