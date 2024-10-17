package hello.fourthweek.domain.order.service;


import hello.fourthweek.domain.order.repository.OrderRepository;
import hello.fourthweek.domain.order.record.request.AddOrderHistoryDomainRequest;
import hello.fourthweek.domain.order.record.request.OrderInfoDomainRequest;
import hello.fourthweek.domain.order.record.response.OrderInfoDomainResponse;
import hello.fourthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {


    private final OrderRepository orderRepository;


    @Transactional
    public OrderInfoInterfacesResponse orderInfo(OrderInfoDomainRequest orderInfoDomainRequest) {
        OrderInfoDomainResponse response = orderRepository.orderInfo(orderInfoDomainRequest.toEntity());
        return response.toInterfaces();
    }


    @Transactional
    public boolean addOrderHistory(AddOrderHistoryDomainRequest addOrderHistoryDomainRequest) {
        try {
            orderRepository.addOrderHistory(addOrderHistoryDomainRequest.toEntity());

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
