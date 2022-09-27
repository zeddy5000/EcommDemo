package africa.semicolon.lumexpress.data.repositories;

import africa.semicolon.lumexpress.data.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Long> {
}
