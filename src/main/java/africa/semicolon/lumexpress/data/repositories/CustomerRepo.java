package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
