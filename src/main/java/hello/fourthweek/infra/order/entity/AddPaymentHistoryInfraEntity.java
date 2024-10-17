package hello.fourthweek.infra.order.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "PAYMENT_HISTORY")
public class AddPaymentHistoryInfraEntity {

    @Id
    private long memberId;
    private long orderId;
    private int paymentAmount;
}
