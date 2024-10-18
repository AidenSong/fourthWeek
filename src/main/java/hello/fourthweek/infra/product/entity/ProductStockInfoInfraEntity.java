package hello.fourthweek.infra.product.entity;


import hello.fourthweek.domain.product.record.response.ProductStockInfoDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_STOCK")
public class ProductStockInfoInfraEntity {

    @Id
    private long prorductId;
    private long productOptionId;
    private int productQuantity;


    public ProductStockInfoDomainResponse toDomain() {
        return new ProductStockInfoDomainResponse(prorductId, productOptionId, productQuantity);
    }
}
