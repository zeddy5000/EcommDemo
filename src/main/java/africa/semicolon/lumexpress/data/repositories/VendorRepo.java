package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo extends JpaRepository<Vendor,Long> {
}
