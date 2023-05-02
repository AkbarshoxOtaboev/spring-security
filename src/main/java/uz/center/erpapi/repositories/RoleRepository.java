package uz.center.erpapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.center.erpapi.domains.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findRoleByName(String name);
}
