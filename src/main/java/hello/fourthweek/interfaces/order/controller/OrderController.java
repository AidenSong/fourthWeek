package hello.fourthweek.interfaces.order.controller;


import hello.fourthweek.domain.order.service.OrderService;
import hello.fourthweek.interfaces.order.record.request.AddOrderHistoryInterfacesRequest;
import hello.fourthweek.interfaces.order.record.request.OrderInfoInterfacesRequest;
import hello.fourthweek.interfaces.order.record.response.OrderInfoInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class OrderController {


    private OrderService orderService;


    @GetMapping("/orderInfo")
    public OrderInfoInterfacesResponse orderInfo(@RequestBody OrderInfoInterfacesRequest orderInfoInterfacesRequest) {
        return orderService.orderInfo(orderInfoInterfacesRequest.toDomain());
    }

    @PostMapping("/addOrderHistory")
    public boolean addOrderHistory(@RequestBody AddOrderHistoryInterfacesRequest addOrderHistoryInterfacesRequest) {
        return orderService.addOrderHistory(addOrderHistoryInterfacesRequest.toDomain());
    }
}
