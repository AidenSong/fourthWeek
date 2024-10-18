package hello.fourthweek.infra.product.entity;


import hello.fourthweek.domain.product.record.response.AddProductHistoryDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "PRODUCT_HISTORY")
public class AddProductHistoryInfraEntity {

    @Id
    private long productId;
    private int indeAmount;
    private int totalAmount;
    private LocalDateTime createdAt;

    public AddProductHistoryDomainResponse toDomain() {
        return new AddProductHistoryDomainResponse(productId, indeAmount, totalAmount, createdAt);
    }
}
