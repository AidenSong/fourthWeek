package hello.fourthweek.infra.order.entity;


import hello.fourthweek.domain.order.record.response.OrderInfoDomainResponse;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "ORDER_INFO")
public class OrderInfoInfraEntity {

    private long orderId;
    private long memberId;
    private String productList;
    private String optionList;
    private String quantityList;


    public OrderInfoDomainResponse toDomain() {
        return new OrderInfoDomainResponse(orderId, memberId, productList, optionList, quantityList);
    }
}
