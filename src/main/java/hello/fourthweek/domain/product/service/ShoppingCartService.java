package hello.fourthweek.domain.product.service;


import hello.fourthweek.domain.product.record.request.AddToCartDomainRequest;
import hello.fourthweek.domain.product.record.response.AddToCartDomainResponse;
import hello.fourthweek.domain.product.repository.ShoppingCartRepository;
import hello.fourthweek.interfaces.product.record.response.AddToCartInterfacesResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ShoppingCartService {


    private final ShoppingCartRepository shoppingCartRepository;



    @Transactional
    // 쇼핑카트에 제품 추가
    public AddToCartInterfacesResponse addToCart(AddToCartDomainRequest addToCartDomainRequest) {
        AddToCartDomainResponse response = shoppingCartRepository.addToCart(addToCartDomainRequest.toEntity());
        return response.toInterfaces();
    }

    @Transactional
    // 쇼핑카트에 제품 삭제
    public boolean deleteFromCart(long productId) {

        try {
            shoppingCartRepository.deleteFromCart(productId);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

}
