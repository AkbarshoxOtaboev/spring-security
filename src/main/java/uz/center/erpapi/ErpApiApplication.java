package uz.center.erpapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import uz.center.erpapi.domains.Role;
import uz.center.erpapi.domains.User;
import uz.center.erpapi.services.UserService;

import java.util.ArrayList;

@SpringBootApplication
public class ErpApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpApiApplication.class, args);
    }

    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder (){
        return new BCryptPasswordEncoder();
    }
    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null, "ROLE_USER"));
            userService.saveRole(new Role(null, "ROLE_MANAGER"));
            userService.saveRole(new Role(null, "ROLE_ADMIN"));
            userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null, "Otaboyev Abror", "abror", "12345", new ArrayList<>()));
            userService.saveUser(new User(null, "Adbullayev Akbar", "akbar", "12345", new ArrayList<>()));
            userService.saveUser(new User(null, "Otaboyev Artur", "artur", "12345", new ArrayList<>()));
            userService.saveUser(new User(null, "Komiljonov Behruz", "behruz", "12345", new ArrayList<>()));

            userService.addRoleToUser("abror", "ROLE_USER");
            userService.addRoleToUser("abror", "ROLE_MANAGER");
            userService.addRoleToUser("akbar", "ROLE_ADMIN");
            userService.addRoleToUser("akbar", "ROLE_SUPER_ADMIN");
            userService.addRoleToUser("artur","ROLE_USER");
            userService.addRoleToUser("behruz","ROLE_USER");
        };
    }

}
