package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
