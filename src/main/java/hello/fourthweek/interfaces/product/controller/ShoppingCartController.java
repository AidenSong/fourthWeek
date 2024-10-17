package hello.fourthweek.interfaces.product.controller;


import hello.fourthweek.domain.product.service.ShoppingCartService;
import hello.fourthweek.interfaces.product.record.request.AddToShoppingCartInterfacesRequest;
import hello.fourthweek.interfaces.product.record.response.AddToCartInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;


    // 쇼핑 카트에 제품 추가
    @GetMapping("/addToCart")
    public AddToCartInterfacesResponse addToCart(@RequestBody AddToShoppingCartInterfacesRequest addToShoppingCartInterfacesRequest) {
        return shoppingCartService.addToCart(addToShoppingCartInterfacesRequest.toDomain());
    }

    // 쇼핑 카트에 제품 삭제
    @GetMapping("/deleteFromCart")
    public boolean deleteFromCart(@RequestParam long productId) {
        return shoppingCartService.deleteFromCart(productId);
    }
}
