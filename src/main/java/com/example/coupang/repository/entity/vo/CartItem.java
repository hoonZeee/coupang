package com.example.coupang.repository.entity.vo;

import com.example.coupang.repository.entity.Product;
import com.example.coupang.repository.entity.ProductOption;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CartItem {
    private final Long productId;
    private final String productName;
    private final Long optionId;
    private final String optionName;
    private final long price;
    private int quantity;

    public CartItem(Product product, ProductOption option, int quantity){
        this.productId = product.getId();
        this.productName = product.getName();
        this.optionId = product.getId();
        this.optionName = product.getName();
        this.price = option.getPrice();
        this.quantity = quantity;
    }

    public void increaseQuantity(int quantity){
        this.quantity += quantity;
    }

    public long calculatePrice(){
        return price * quantity;
    }


}
