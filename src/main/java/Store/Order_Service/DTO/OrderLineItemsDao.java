package Store.Order_Service.DTO;

import java.math.BigDecimal;

public class OrderLineItemsDao {
    private Long id;

    private String skucode;

    private BigDecimal price;

    private Integer quantity;

    public OrderLineItemsDao() {
    }

    public OrderLineItemsDao(Long id, String skucode, BigDecimal price, Integer quantity) {
        this.id = id;
        this.skucode = skucode;
        this.price = price;
        this.quantity = quantity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkucode() {
        return skucode;
    }

    public void setSkucode(String skucode) {
        this.skucode = skucode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
