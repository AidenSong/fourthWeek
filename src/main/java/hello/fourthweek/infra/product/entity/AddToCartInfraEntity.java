package hello.fourthweek.infra.product.entity;


import hello.fourthweek.domain.product.record.response.AddToCartDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "SHOPPING_CART")
public class AddToCartInfraEntity {

    @Id
    private long productId;
    private long productOptionId;
    private int quantity;


    public AddToCartDomainResponse toDomain() {
        return new AddToCartDomainResponse(productId, productOptionId, quantity);
    }
}
