package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepo extends JpaRepository<Store,Long> {
}
