package hello.fourthweek.interfaces.product.controller;


import hello.fourthweek.domain.product.service.ProductService;
import hello.fourthweek.interfaces.product.record.request.*;
import hello.fourthweek.interfaces.product.record.response.AddProductHistoryInterfacesResponse;
import hello.fourthweek.interfaces.product.record.response.ProductOptionRegistInterfacesResponse;
import hello.fourthweek.interfaces.product.record.response.ProductRegistInterfacesResponse;
import hello.fourthweek.interfaces.product.record.response.ProductStockInfoInterfacesResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/product")
public class ProductController {


    private final ProductService productService;


    // 제품 등록
    @PostMapping("/regist")
    public ProductRegistInterfacesResponse productRegist(@RequestBody ProductRegistInterfacesRequest productRegistInterfacesRequest) {
        return productService.productRegist(productRegistInterfacesRequest.toDomain());
    }

    // 제품 옵션 등록
    @PostMapping("/stockOptionRegist")
    public ProductOptionRegistInterfacesResponse productOptionRegist(@RequestBody ProductOptionRegistInterfacesRequest productOptionRegistInterfacesRequest) {
        return productService.productOptionRegist(productOptionRegistInterfacesRequest.toDomain());
    }

    // 제품 재고 정보
    @GetMapping("/stockInfo")
    public ProductStockInfoInterfacesResponse productStockInfo(@RequestBody ProductStockInfoInterfacesRequest productStockInfoInterfacesRequest) {
        return productService.productStockInfo(productStockInfoInterfacesRequest.toDomain());
    }

    // 제품 히스토리 추가
    @PostMapping("/addProductHistory")
    public AddProductHistoryInterfacesResponse addProductHistory(@RequestBody AddProductHistoryInterfaceRequest addProductHistoryInterfaceRequest) {
        return productService.addProductHistory(addProductHistoryInterfaceRequest.toDomain());
    }

    // 제품 증감 업데이트
    @PutMapping("/updateProductQuantity")
    public ProductStockInfoInterfacesResponse updateProductQuantity(@RequestBody UpdateProductQuantityInterfacesRequest updateProductQuantityInterfacesRequest) {
        return productService.updateProductQuantity(updateProductQuantityInterfacesRequest.toDomain());
    }





}
