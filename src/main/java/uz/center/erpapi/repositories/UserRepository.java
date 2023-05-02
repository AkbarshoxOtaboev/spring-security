package uz.center.erpapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.erpapi.domains.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
