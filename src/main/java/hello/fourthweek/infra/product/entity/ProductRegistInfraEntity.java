package hello.fourthweek.infra.product.entity;


import hello.fourthweek.domain.product.record.response.ProductRegistDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_INFO")
public class ProductRegistInfraEntity {

    @Id
    private long productId;
    private String productName;

    public ProductRegistDomainResponse toDomain() {
        return new ProductRegistDomainResponse(productId, productName);
    }
}
