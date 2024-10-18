package hello.fourthweek.infra.product.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "SHOPPING_CART")
public class DeleteFromCartInfraEntity {

    @Id
    private long productId;
}
