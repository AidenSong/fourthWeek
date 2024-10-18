package hello.fourthweek.infra.product.entity;


import hello.fourthweek.domain.product.record.response.ProductOptionRegistDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_STOCK")
public class UpdateProductQuantityInfraEntity {

    @Id
    private long productOptionId;
    private long productId;
    private int indeAmount;
}
