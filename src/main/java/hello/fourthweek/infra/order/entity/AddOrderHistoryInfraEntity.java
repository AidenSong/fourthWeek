package hello.fourthweek.infra.order.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "ORDER_HISTORY")
public class AddOrderHistoryInfraEntity {

    @Id
    private long memberId;
    private long productId;
    private int quantity;
    private LocalDateTime createdAt;
}
