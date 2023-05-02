package uz.center.erpapi.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.center.erpapi.utils.TableName;

import javax.persistence.*;

@Entity
@Table(name = TableName.ROLES)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

}
